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

const routes: Routes = [
  {path : 'login', component : LoginComponent},
  {path : 'cadastra', component : CadastroComponent},
  {
    path:'', component: NavComponent, children:[
      {path : 'home', component : HomeComponent },
      {path : 'filme', component : FilmeComponent},
      {path : 'cinema', component : CinemaComponent},
      {path : 'filme/sobreFilme', component : SobreFilmeComponent},
      {path : 'cinema/sobreCinema/:id', component : SobreCinemaComponent},
      {path : 'assentos', component : AssentoComponent},
      {path : 'assentos/pagamento/debito', component : DebitoComponent},
      {path : 'assentos/pagamento/credito', component : CreditoComponent},
      {path : 'assentos/pagamento/dinheiro', component : DinheiroComponent},
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
