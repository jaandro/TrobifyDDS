import { Injectable } from '@angular/core';
import { HttpClient, HttpRequest } from '@angular/common/http';
import { Busqueda } from '../Modelo/busqueda';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }

  Url='http://localhost:8080/home';

  busqueda(busqueda: Busqueda):Observable<any[]> {
    return this.http.post<any[]>(this.Url, busqueda);    //envias busqueda al back
  }

}
