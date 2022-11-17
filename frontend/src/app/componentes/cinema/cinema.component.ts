import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/service/auth.service';
import { Cinema } from 'src/app/models/cinema';

@Component({
  selector: 'app-cinema',
  templateUrl: './cinema.component.html',
  styleUrls: ['./cinema.component.css']
})
export class CinemaComponent implements OnInit {

 cinema : Cinema[] = [];

  constructor( private service: AuthService) { }

  ngOnInit(): void {
    this.mapear();
  }

  mapear(){
    this.service.todosCinema().subscribe(resposta => this.cinema = resposta);  
  }

}
