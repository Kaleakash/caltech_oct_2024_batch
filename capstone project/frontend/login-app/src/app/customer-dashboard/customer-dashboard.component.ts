import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-dashboard',
  templateUrl: './customer-dashboard.component.html',
  styleUrls: ['./customer-dashboard.component.css']
})
export class CustomerDashboardComponent implements OnInit {
  user:string ="";
  constructor(public router:Router){}
  
  
  ngOnInit(): void {
      let obj = sessionStorage.getItem("user");
      if(obj!=null){
        this.user = obj;
      }
  }
   logout(): void {
      this.router.navigate(['/']);
  }
}
