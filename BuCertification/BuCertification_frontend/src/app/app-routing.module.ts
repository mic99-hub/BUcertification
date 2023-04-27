import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {EmployeeListComponent} from "./employee-list/employee-list.component";
import {SaveEmployeeComponent} from "./save-employee/save-employee.component";
import {UpdateEmployeeComponent} from "./update-employee/update-employee.component";
import {CertificationListComponent} from "./certification-list/certification-list.component";

const routes: Routes = [
  {path:'employees-list' , component: EmployeeListComponent},
  {path:'save-employee' , component: SaveEmployeeComponent},
  {path:'update-employee/:id' , component: UpdateEmployeeComponent},
  {path:'certifications-list' , component : CertificationListComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
