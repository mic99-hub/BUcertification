import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Certification} from "./certification";

@Injectable({
  providedIn: 'root'
})
export class CertificationService {

  constructor(private httpClient : HttpClient) {}

  getCertificationList(): Observable<Certification[]>{
    return this.httpClient.get<Certification[]>(`http://localhost:8080/certification`);
  }

}
