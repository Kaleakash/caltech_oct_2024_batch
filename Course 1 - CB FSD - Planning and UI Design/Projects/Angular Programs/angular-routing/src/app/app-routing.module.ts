import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';

// http://localhost:4200      main path or first page 
// http://localhost:4200/about 

const routes: Routes = [
  {path:"about",component:AboutusComponent},
  {path:"contact",component:ContactusComponent},
  {path:"login",component:LoginComponent},
  {path:"home",component:DashboardComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
