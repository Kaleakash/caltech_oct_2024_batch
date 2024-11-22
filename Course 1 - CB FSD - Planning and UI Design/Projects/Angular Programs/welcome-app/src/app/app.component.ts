import { Component } from '@angular/core';

@Component({
  selector: 'app-root',   //<app-root></app-root>
  templateUrl: './app.component.html',  // connect to html page or template page. 
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'welcome-app';
  name:string ="Akash Kale";
}
