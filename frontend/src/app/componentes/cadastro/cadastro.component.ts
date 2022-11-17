import { Component, OnInit } from '@angular/core';
import { Cadastra } from 'src/app/models/cadastro';
import { FormControl, Validators } from '@angular/forms';
import { AuthService } from 'src/app/service/auth.service';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';


@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  constructor(private toast: ToastrService, private service: AuthService, private router: Router) { }

  ngOnInit(): void {
  }

  cadastro : Cadastra = {
    email: '',
    dNascimento: '',
    senha: ''
  }

  email = new FormControl(null, Validators.email);
  dNascimento = new FormControl(null, Validators.minLength(3));
  senha = new FormControl(null, Validators.minLength(3));

  validaCampos(): boolean{
    return this.email.valid && this.senha.valid && this.dNascimento.valid;
  }

  cadastra(){
      this.service.cadastra(this.cadastro).subscribe(resposta =>{
          this.toast.success('Cadastrado com sucesso!','Login');
          this.router.navigate(['/login']);
        },
        () =>{
          this.toast.error('Usuário e/ou senha inválidos')
        }
      );
    
  }

}
