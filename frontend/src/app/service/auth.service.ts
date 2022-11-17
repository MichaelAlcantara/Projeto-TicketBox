import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Credenciais } from '../models/credenciais';
import { Observable } from 'rxjs';
import { Cadastra } from '../models/cadastro';
import { Cinema } from '../models/cinema';


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  login(creds: Credenciais) : Observable<any>{
    return this.http.post<any>('http://localhost:8080/clientes/login',creds);
  }

  cadastra(cadastra: Cadastra) : Observable<any>{
    return this.http.post<any>('http://localhost:8080/clientes/cadastra',cadastra);
  }

  todosCinema(): Observable<any[]>{
    return this.http.get<any[]>('http://localhost:8080/cinemas');
  }

  cinemaPorId(id : number): Observable<any>{
    return this.http.get<any>(`http://localhost:8080/cinemas/${id}`);
  }

  todosFilme(): Observable<any[]>{
    return this.http.get<any[]>('http://localhost:8080/filme');
  }

}
