import { Component, OnInit } from '@angular/core';
import { Filme } from 'src/app/models/filme';
import { AuthService } from 'src/app/service/auth.service';

@Component({
  selector: 'app-filme',
  templateUrl: './filme.component.html',
  styleUrls: ['./filme.component.css']
})
export class FilmeComponent implements OnInit {

  filmes : Filme[] = [];


  constructor(private service: AuthService) { }

  ngOnInit(): void {
    this.mapear();
  }

  mapear(){
    this.service.todosFilme().subscribe(resposta => this.filmes = resposta);  
  }

}
