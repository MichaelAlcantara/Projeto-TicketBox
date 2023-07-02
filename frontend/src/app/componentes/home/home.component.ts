import { Component, OnInit } from '@angular/core';
import { Filme } from 'src/app/models/filme';
import { AuthService } from 'src/app/service/auth.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  filmes : Filme[] = [];


  constructor(private service: AuthService) { }

  ngOnInit(): void {
    this.mapear();
  }

  mapear(){
    this.service.todosFilme().subscribe(resposta => this.filmes = resposta);  
  }
}
