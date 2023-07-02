import { Component, OnInit } from '@angular/core';
import { Assento } from 'src/app/models/assento';
import { AuthService } from 'src/app/service/auth.service';

@Component({
  selector: 'app-compra',
  templateUrl: './compra.component.html',
  styleUrls: ['./compra.component.css']
})
export class CompraComponent implements OnInit {

  assento: Assento[];
  compra : Assento;

  constructor( private service: AuthService) { }

  ngOnInit(): void {
    this.service.assento().subscribe(respota => {
      this.assento = respota;
    });
  }

}
