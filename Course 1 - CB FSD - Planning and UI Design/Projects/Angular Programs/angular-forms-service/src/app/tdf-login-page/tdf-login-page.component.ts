import { Component } from '@angular/core';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-tdf-login-page',
  templateUrl: './tdf-login-page.component.html',
  styleUrls: ['./tdf-login-page.component.css']
})
export class TdfLoginPageComponent {
  msg:string ="";

  constructor(public ls1:LoginService){   // DI using constructor base 
                                          // pull the object. 
  }
  checkLoginDetails(loginRef:any): void {
    //console.log(loginRef)
    let login = loginRef.value;   // only extract value information from loginRef form object. 
    console.log(login);
    // this information we will check from backend technologies with database. 
    // if(login.emailid=="akash@gmail.com" && login.password=="123"){
    //     this.msg="successfully login"
    // }else {
    //     this.msg = "failure try once again";
    // }
    // if service is normal class then we need create the object of that class. 
    //let ls = new LoginService();
    //this.msg=ls.checkLoginDetails(login);
    // we can access login service class functions using DI concept. 
    this.msg = this.ls1.checkLoginDetails(login);
    loginRef.reset();     // reset the value;
  }
}
