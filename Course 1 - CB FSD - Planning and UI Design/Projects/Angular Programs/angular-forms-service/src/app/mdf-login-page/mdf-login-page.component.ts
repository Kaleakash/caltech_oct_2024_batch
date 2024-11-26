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
f1:boolean = false;
f2:boolean = false;
msg:string="";
// these information we will check with help of back end technologies like java 
checkLoginDetials(): void {
  let login = this.loginRef.value;
  if(login.emailid=="akash@gmail.com" && login.password=="123"){
      this.msg="successfully login"
      this.f1=true;
      this.f2=false;
  }else {
    this.msg = "Failure try once again"
    this.f2=true;
    this.f1=false;
  }
  this.loginRef.reset();
}
}
