import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-mdf-login-page',
  templateUrl: './mdf-login-page.component.html',
  styleUrls: ['./mdf-login-page.component.css']
})
export class MdfLoginPageComponent {

loginRef = new FormGroup({
  emailid:new FormControl(),
  password:new FormControl()
});
msg:string="";
// these information we will check with help of back end technologies like java 
checkLoginDetials(): void {
  let login = this.loginRef.value;
  if(login.emailid=="akash@gmail.com" && login.password=="123"){
      this.msg="successfully login"
  }else {
    this.msg = "Failure try once again"
  }
  this.loginRef.reset();
}
}
