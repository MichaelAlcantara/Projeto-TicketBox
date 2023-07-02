import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Filme } from 'src/app/models/filme';
import { Sessao } from 'src/app/models/sessao';
import { AuthService } from 'src/app/service/auth.service';

@Component({
  selector: 'app-sobre-filme',
  templateUrl: './sobre-filme.component.html',
  styleUrls: ['./sobre-filme.component.css']
})
export class SobreFilmeComponent implements OnInit {

  filme : Filme;
  sessoes : Sessao[] = [];
  private idFilme:any;

  constructor(private route : ActivatedRoute,  private service: AuthService) { }

  ngOnInit(): void {
    this.service.todasSessao().subscribe(resposta => this.sessoes = resposta);  
    this.idFilme = this.route.snapshot.paramMap.get('idFilme')
    this.service.filmePorId(this.idFilme).subscribe(respota => {
      this.filme = respota;
    });
  }

}
