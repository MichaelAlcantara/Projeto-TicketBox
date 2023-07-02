import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import {FormsModule, ReactiveFormsModule} from '@angular/forms';

import { HttpClientModule } from '@angular/common/http'

import { MatFormFieldModule } from '@angular/material/form-field'
import { MatPaginatorModule } from '@angular/material/paginator'
import { MatSnackBarModule } from '@angular/material/snack-bar'
import { MatCheckboxModule } from '@angular/material/checkbox'
import { MatToolbarModule } from '@angular/material/toolbar'
import { MatSidenavModule } from '@angular/material/sidenav'
import { MatButtonModule } from '@angular/material/button'
import { MatSelectModule } from '@angular/material/select'
import { MatTableModule } from '@angular/material/table'
import { MatRadioModule } from '@angular/material/radio'
import { MatIconModule } from '@angular/material/icon'
import { MatListModule } from '@angular/material/list'
import { MatCardModule } from '@angular/material/card';
import { FilmeComponent } from './componentes/filme/filme.component';
import { CinemaComponent } from './componentes/cinema/cinema.component';
import { CadastroComponent } from './componentes/cadastro/cadastro.component';
import {MatInputModule} from '@angular/material/input';
import { ToastrModule } from 'ngx-toastr';
import {MatStepperModule} from '@angular/material/stepper';
import {CdkTreeModule} from '@angular/cdk/tree';


//Componentes do projeto
import { NavComponent } from './componentes/nav/nav.component';
import { HomeComponent } from './componentes/home/home.component';
import { LoginComponent } from './componentes/login/login.component';
import { SobreFilmeComponent } from './componentes/filme/sobre-filme/sobre-filme.component';
import { SobreCinemaComponent } from './componentes/cinema/sobre-cinema/sobre-cinema.component';
import { SessaoComponent } from './componentes/sessao/sessao.component';
import { AssentoComponent } from './componentes/assento/assento.component';
import { DebitoComponent } from './componentes/assento/formaPagamento/debito/debito.component';
import { CreditoComponent } from './componentes/assento/formaPagamento/credito/credito.component';
import { DinheiroComponent } from './componentes/assento/formaPagamento/dinheiro/dinheiro.component';
import { CompraComponent } from './componentes/assento/compra/compra.component';
import { FimComponent } from './componentes/assento/formaPagamento/fim/fim.component';

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    HomeComponent,
    FilmeComponent,
    CinemaComponent,
    LoginComponent,
    CadastroComponent,
    SobreFilmeComponent,
    SobreCinemaComponent,
    SessaoComponent,
    AssentoComponent,
    DebitoComponent,
    CreditoComponent,
    DinheiroComponent,
    CompraComponent,
    FimComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatFormFieldModule,
    MatPaginatorModule,
    MatSnackBarModule,
    MatCheckboxModule,
    MatToolbarModule,
    MatSidenavModule,
    MatSelectModule,
    MatTableModule,
    MatRadioModule,
    MatInputModule,
    MatIconModule,
    MatListModule,
    MatCardModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MatButtonModule,
    MatStepperModule,
    CdkTreeModule,
    ToastrModule.forRoot({
      timeOut: 4000,
      closeButton: true,
      progressBar: true
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
