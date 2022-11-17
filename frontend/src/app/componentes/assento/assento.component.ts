import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ArrayDataSource} from '@angular/cdk/collections';
import {FlatTreeControl} from '@angular/cdk/tree';

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


  constructor(private _formBuilder: FormBuilder) {}

  ngOnInit() {
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
  }
}
