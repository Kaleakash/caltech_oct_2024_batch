import { Component } from '@angular/core';

@Component({
  selector: 'app-tdf-login-page',
  templateUrl: './tdf-login-page.component.html',
  styleUrls: ['./tdf-login-page.component.css']
})
export class TdfLoginPageComponent {
  msg:string ="";
  checkLoginDetails(loginRef:any): void {
    
    //console.log(loginRef)
    let login = loginRef.value;   // only extract value information from loginRef form object. 
    console.log(login);
    // this information we will check from backend technologies with database. 
    if(login.emailid=="akash@gmail.com" && login.password=="123"){
        this.msg="successfully login"
    }else {
        this.msg = "failure try once again";
    }
    loginRef.reset();     // reset the value;
  }
}
