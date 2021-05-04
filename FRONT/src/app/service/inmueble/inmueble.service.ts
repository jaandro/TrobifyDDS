import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Inmueble } from 'app/Modelo/inmueble';

@Injectable({
  providedIn: 'root'
})
export class InmuebleService {

  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/addEditInmueble';

  addInuemble(inmueble: Inmueble){
    return this.http.post<Inmueble>(this.Url, inmueble);
  }
}
