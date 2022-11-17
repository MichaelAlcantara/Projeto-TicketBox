import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route } from '@angular/router';
import { Cinema } from 'src/app/models/cinema';
import { AuthService } from 'src/app/service/auth.service';


@Component({
  selector: 'app-sobre-cinema',
  templateUrl: './sobre-cinema.component.html',
  styleUrls: ['./sobre-cinema.component.css']
})
export class SobreCinemaComponent implements OnInit {

  cinema : Cinema;
  id: number;

  constructor(private activatedRouter : ActivatedRoute,  private service: AuthService) { }

  ngOnInit(): void {
    let params = this.activatedRouter.snapshot.paramMap.get('id');
    this.service.cinemaPorId(this.id).subscribe(response => this.cinema = response);
  }

}
