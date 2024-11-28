import { Injectable } from "@angular/core";

@Injectable({
  providedIn:"root"
})
export class LoginService {

  constructor() { }

  checkLoginDetails(login:any):string {
    if(login.emailid=="akash@gmail.com" && login.password=="123"){
      return "successfully login";
    }else {
      return "failure try once again";
    }
  }
}
