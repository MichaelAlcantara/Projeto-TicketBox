import { Component, OnInit, ViewChild } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import { Sessao } from 'src/app/models/sessao';
import { ActivatedRoute } from '@angular/router';
import { AuthService } from 'src/app/service/auth.service';
import { Assento } from 'src/app/models/assento';
import { ToastrComponentlessModule, ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-assento',
  templateUrl: './assento.component.html',
  styleUrls: ['./assento.component.css']
})
export class AssentoComponent implements OnInit {

  isLinear = false;
  firstFormGroup: FormGroup;
  secondFormGroup: FormGroup;
  treeFormGroup: FormGroup;
  fourFormGroup: FormGroup;
  credito: FormGroup;
  debito: FormGroup;
  dinheiro: FormGroup;
  sessao : Sessao;
  private idSessao:any;
  assento: Assento[];
  compra : Assento;
  selecionado : Assento[] = [];
  total : any;
  op(){
    return[
      { valor :'m', desc: 'Meia'},
      { valor :'i', desc: 'Inteira'}
    ]
  }
  valores : any[] = [];
  aux : any;

  constructor(private toast: ToastrService, private route : ActivatedRoute,  private service: AuthService, private _formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.firstFormGroup = this._formBuilder.group({
      firstCtrl: ['', Validators.required]
    });
    this.secondFormGroup = this._formBuilder.group({
      secondCtrl: ['', Validators.required]
    });
    this.treeFormGroup = this._formBuilder.group({
      firstCtrl: ['', Validators.required]
    });
    this.fourFormGroup = this._formBuilder.group({
      secondCtrl: ['', Validators.required]
    });
    this.idSessao = this.route.snapshot.paramMap.get('idSessao')
    this.service.sessaoPorId(this.idSessao).subscribe(respota => {
      this.sessao = respota;
    });
    this.service.assento().subscribe(respota => {
      this.assento = respota;
    });
    
  }

  click(id , nome, situacao, qtd){
    situacao = true;
    this.compra = {id, nome, situacao, qtd};
    this.selecionado.push(this.compra);
    this.service.compra(this.compra).subscribe(resposta =>{
      this.toast.info("Assento " + this.compra.nome +" selecionado;");
    }, error =>{
      console.log("Deu erro!");
    })
    
  }

  opcao(valor, desc, qtd, preco){
    this.toast.info("Opção selecionada!");
    if(valor == "m"){
      preco = preco/2;
    }else{
      preco = preco;
    }
    if(valor == "m"){
      qtd = qtd + 1;
      this.aux = {valor, desc, qtd, preco};
      this.valores.push(this.aux);
    }else{
      qtd = qtd + 1;
      this.aux = {valor, desc, qtd, preco};
      this.valores.push(this.aux);
    }
    if(this.valores.length > 1){
      preco = preco + preco;
    }
    
    this.total = preco;
    
  }
}
