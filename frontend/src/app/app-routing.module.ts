import { NgModule } from '@angular/core';
import { ChildActivationStart, RouterModule, Routes } from '@angular/router';
import { CinemaComponent } from './componentes/cinema/cinema.component';
import { FilmeComponent } from './componentes/filme/filme.component';
import { HomeComponent } from './componentes/home/home.component';
import { CadastroComponent } from './componentes/cadastro/cadastro.component';
import { LoginComponent } from './componentes/login/login.component';
import { NavComponent } from './componentes/nav/nav.component';
import { SobreFilmeComponent } from './componentes/filme/sobre-filme/sobre-filme.component';
import { SobreCinemaComponent } from './componentes/cinema/sobre-cinema/sobre-cinema.component';
import { AssentoComponent } from './componentes/assento/assento.component';
import { DebitoComponent } from './componentes/assento/formaPagamento/debito/debito.component';
import { CreditoComponent } from './componentes/assento/formaPagamento/credito/credito.component';
import { DinheiroComponent } from './componentes/assento/formaPagamento/dinheiro/dinheiro.component';
import { SessaoComponent } from './componentes/sessao/sessao.component';
import { CompraComponent } from './componentes/assento/compra/compra.component';
import { FimComponent } from './componentes/assento/formaPagamento/fim/fim.component';

const routes: Routes = [
  {path : 'login', component : LoginComponent},
  {path : 'cadastra', component : CadastroComponent},
  {
    path:'', component: NavComponent, children:[
      {path : 'home', component : HomeComponent },
      {path : 'filme', component : FilmeComponent},
      {path : 'cinemas', component : CinemaComponent},
      {path : 'sessao', component : SessaoComponent},
      {path : 'filme/sobre/:idFilme', component : SobreFilmeComponent},
      {path : 'cinemas/sobre/:idCinema', component : SobreCinemaComponent},
      {path : 'assentos/sobre/:idSessao', component : AssentoComponent, children:[
        {path : 'compra', component : CompraComponent},
      ]},
      {path : 'pagamento/debito', component : DebitoComponent},
      {path : 'pagamento/credito', component : CreditoComponent},
      {path : 'pagamento/dinheiro', component : DinheiroComponent},
      {path : 'pagamento/fim', component : FimComponent},
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
