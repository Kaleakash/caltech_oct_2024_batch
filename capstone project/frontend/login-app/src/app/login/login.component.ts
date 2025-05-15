import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  loginForm = new FormGroup({
    emailid:new FormControl(''),
    password:new FormControl(''),
    typeofuser:new FormControl(''),
  })

  constructor(public ls:LoginService) { }   // DI for LoginService 
  message:string =""
  signIn():void {
    let login = this.loginForm.value;
    //console.log(login);
    this.ls.signIn(login).subscribe(
      {
        next:(result)=> {
         // console.log(result)
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
