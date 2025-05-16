import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

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

  constructor(public ls:LoginService,public router:Router) { }   // DI for LoginService 
  message:string =""
  signIn():void {
    let login = this.loginForm.value;
    //console.log(login);
    this.ls.signIn(login).subscribe(
      {
        next:(result)=> {
         // console.log(result)
         this.message = result;
         if(login.emailid!=null){

          if(result=="Admin login successfully"){
            //sessionStorage.setItem("user",login.emailid);
            this.router.navigate(['admin_home']);
         }else if(result=="Customer login successfully"){
          //alert(login.emailid)
             sessionStorage.setItem("user",login.emailid);
            this.router.navigate(['customer_home']);
         }else {
          this.message = result;
         }
         
         }
         
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
