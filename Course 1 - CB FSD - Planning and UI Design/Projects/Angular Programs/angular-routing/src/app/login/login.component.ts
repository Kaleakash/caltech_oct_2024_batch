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
// client details present in array variable part of service layer.
logins:Array<any>=[
  {"emailid":"akash@gmail.com","password":"akash123"},
  {"emailid":"admin@gmail.com","password":"admin123"}
]
constructor(public router:Router){      // DI for Router API 

}
checkLoginDetails(): void {
  let login = this.loginRef.value;
  
  let result = this.logins.find(l=>l.emailid==login.emailid && l.password==login.password);
  // if record present it return that record from array else return undefined.
  // we can check with different emailid as well as password from backend 
  //alert(result);
  if(result){
    //alert("Login Successful");
    sessionStorage.setItem("emailid",login.emailid)
    this.router.navigate(["/home"]);
  }else {
  alert("failure try once again")
  }
  this.loginRef.reset();      // clear emailid and password field. 
}
}
