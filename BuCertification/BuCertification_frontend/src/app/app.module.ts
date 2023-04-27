import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from "@angular/common/http";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { SaveEmployeeComponent } from './save-employee/save-employee.component';
import {FormsModule} from "@angular/forms";
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import {NgOptimizedImage} from "@angular/common";
import { CertificationListComponent } from './certification-list/certification-list.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    SaveEmployeeComponent,
    UpdateEmployeeComponent,
    CertificationListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgOptimizedImage
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
