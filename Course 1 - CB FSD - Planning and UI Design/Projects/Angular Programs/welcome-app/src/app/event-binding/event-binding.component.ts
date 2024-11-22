import { Component } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent {
  msg:string="";
  
  message:string="";
  sayHello(): void {
    alert("function called...")
  }

  showMessage():void {
    this.msg="Welcome to Angular Application";
  }
  
  sendName(name:any):void {
    console.log(name)
    let fname = name.value; // name object and value is property 
    this.message="Welcome user "+fname;
  }
}
