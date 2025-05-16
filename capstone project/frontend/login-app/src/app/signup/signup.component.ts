import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {

message:string ="";
   loginForm = new FormGroup({
      emailid:new FormControl(''),
      password:new FormControl(''),
      typeofuser:new FormControl(''),
    })
  
    constructor(public ls:LoginService) {}

    signUp(): void {
      let login = this.loginForm.value;
    //console.log(login);
    this.ls.signUp(login).subscribe(
      {
        next:(result)=> {
        this.message = result; 
        },
        error:(error)=> {
          console.log(error)
        },
        complete:()=> {
          //console.log("Login completed")
        }
      });
    this.loginForm.reset();
    }
}
