import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

loginRef = new FormGroup({
  emailid:new FormControl(),
  password:new FormControl()
});
constructor(public router:Router){      // DI for Router API 

}
checkLoginDetails(): void {
  let login = this.loginRef.value;
  // we can check with different emailid as well as password from backend 
  if(login.emailid == "admin@gmail.com" && login.password == "admin123"){
    alert("Login Successful");
    sessionStorage.setItem("emailid",login.emailid)
    this.router.navigate(["/home"],{skipLocationChange:true});
  }else {
  alert("failure try once again")
  }

  this.loginRef.reset();      // clear emailid and password field. 
}
}
