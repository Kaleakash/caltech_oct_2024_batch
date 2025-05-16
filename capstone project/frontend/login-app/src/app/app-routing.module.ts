import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { CustomerDashboardComponent } from './customer-dashboard/customer-dashboard.component';
import { AdminAddProductComponent } from './admin-add-product/admin-add-product.component';
import { AdminViewProductComponent } from './admin-view-product/admin-view-product.component';
import { CustomerViewProductComponent } from './customer-view-product/customer-view-product.component';

// http://localhost:4200/
const routes: Routes = [
  {path:"",component:LoginComponent},
    {path:"signUp",component:SignupComponent},
      {path:"admin_home",component:AdminDashboardComponent,children:[
          {path:"add_product",component:AdminAddProductComponent},
          {path:"view_product",component:AdminViewProductComponent},

      ]},
        {path:"customer_home",component:CustomerDashboardComponent,children:[
          {path:"view_product",component:CustomerViewProductComponent},
        ]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
