import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Credenciais } from '../models/credenciais';
import { Observable } from 'rxjs';
import { Cadastra } from '../models/cadastro';
import { Cinema } from '../models/cinema';
import { Filme } from '../models/filme';
import { Sessao } from '../models/sessao';
import { Assento } from '../models/assento';


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

  todosCinema(): Observable<Cinema[]>{
    return this.http.get<Cinema[]>('http://localhost:8080/cinemas');
  }

  cinemaPorId(idCinema : any): Observable<Cinema>{
    return this.http.get<Cinema>(`http://localhost:8080/cinemas/sobre/${idCinema}`);
  }

  todosFilme(): Observable<Filme[]>{
    return this.http.get<Filme[]>('http://localhost:8080/filme');
  }

  filmePorId(idFilme : any): Observable<Filme>{
    return this.http.get<Filme>(`http://localhost:8080/filme/sobre/${idFilme}`);
  }

  todasSessao(): Observable<Sessao[]>{
    return this.http.get<Sessao[]>('http://localhost:8080/sessao');
  }

  sessaoPorId(idSessao : any): Observable<Sessao>{
    return this.http.get<Sessao>(`http://localhost:8080/sessao/sobre/${idSessao}`);
  }

  assento(): Observable<Assento[]>{
    return this.http.get<Assento[]>('http://localhost:8080/assento/todos');
  }

  compra(assento : Assento): Observable<any>{
    return this.http.put<any>(`http://localhost:8080/assento/${assento.id}`, assento);
  }

}
