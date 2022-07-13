import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { AprovalClass } from './apirest.model';

@Injectable({
  providedIn: 'root'
})
export class ApirestService {

  private API_SERVER = "http://localhost:8081/api";

  constructor(private http: HttpClient) {}

  public predict(data: AprovalClass): Observable<AprovalClass> {
    return this.http.post<AprovalClass>(this.API_SERVER + '/consume', data);
  }
}