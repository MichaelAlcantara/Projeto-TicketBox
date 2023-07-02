import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route } from '@angular/router';
import { Cinema } from 'src/app/models/cinema';
import { Filme } from 'src/app/models/filme';
import { AuthService } from 'src/app/service/auth.service';


@Component({
  selector: 'app-sobre-cinema',
  templateUrl: './sobre-cinema.component.html',
  styleUrls: ['./sobre-cinema.component.css']
})
export class SobreCinemaComponent implements OnInit {

  cinema : Cinema;
  private idCinema:any;
  filmes : Filme[] = [];

  constructor(private route : ActivatedRoute,  private service: AuthService) { }

  ngOnInit(): void {
    this.idCinema = this.route.snapshot.paramMap.get('idCinema')
    this.service.cinemaPorId(this.idCinema).subscribe(respota => {
      this.cinema = respota;
    });
    this.mapear();
  }

  mapear(){
    this.service.todosFilme().subscribe(resposta => this.filmes = resposta);  
  }

}
