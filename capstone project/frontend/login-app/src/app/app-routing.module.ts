import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';

// http://localhost:4200/
const routes: Routes = [
  {path:"",component:LoginComponent},
    {path:"signup",component:SignupComponent},
      {path:"admin_home",component:AdminDashboardComponent},
        {path:"customer_home",component:CustomerDashboardComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
