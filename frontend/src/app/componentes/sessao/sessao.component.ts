import { Component, OnInit } from '@angular/core';
import { Sessao } from 'src/app/models/sessao';
import { AuthService } from 'src/app/service/auth.service';

@Component({
  selector: 'app-sessao',
  templateUrl: './sessao.component.html',
  styleUrls: ['./sessao.component.css']
})
export class SessaoComponent implements OnInit {

  sessao : Sessao[];

  constructor(  private service: AuthService) { }

  ngOnInit(): void {
    this.mapear();    
  }

  mapear(){
    this.service.todasSessao().subscribe(response => {this.sessao = response});
  }

  

}
