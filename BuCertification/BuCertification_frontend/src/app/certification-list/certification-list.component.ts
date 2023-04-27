import {Component, OnInit} from '@angular/core';
import {Certification} from "../certification";
import {CertificationService} from "../certification.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-certification-list',
  templateUrl: './certification-list.component.html',
  styleUrls: ['./certification-list.component.css']
})
export class CertificationListComponent implements OnInit{

  certifications! : Certification[];

  constructor( private certificationService : CertificationService ,
               private router : Router) {
  }


  ngOnInit(): void {
    this.getCertifications();
  }

  private getCertifications(){
    this.certificationService.getCertificationList().subscribe(data=> {
      console.log(data);
      this.certifications = data;
    })
  }

}
