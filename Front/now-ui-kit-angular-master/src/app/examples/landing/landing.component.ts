import { Component, OnInit } from '@angular/core';
import { ConsultasService } from 'app/services/consultas.service';

@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.scss']
})
export class LandingComponent implements OnInit {
  data : Date = new Date();
  focus;
  focus1;

  datosCrearPersona : dataPersona;
  usuarioCorrecto : boolean;

  constructor(private service: ConsultasService) { }

  ngOnInit() {
    var body = document.getElementsByTagName('body')[0];
    body.classList.add('login-page');

    var navbar = document.getElementsByTagName('nav')[0];
    navbar.classList.add('navbar-transparent');

    this.usuarioCorrecto = false;
  }
  ngOnDestroy(){
    var body = document.getElementsByTagName('body')[0];
    body.classList.remove('login-page');

    var navbar = document.getElementsByTagName('nav')[0];
    navbar.classList.remove('navbar-transparent');
  }

  registrarse(numeroDocumento, clave, nombres, apellidos, telefono, direccion, dependencia, empleado){

    this.datosCrearPersona = {
      numeroDocumento : numeroDocumento,
      clave : clave,
      nombres : nombres,
      apellidos :apellidos,
      telefono : telefono, 
      direccion : direccion, 
      dependencia :dependencia, 
      empleado :empleado
    }

    this.service.crearPersona(this.datosCrearPersona).subscribe(data=>{      
      console.log('dataUsuario Creado',data);
    })

    this.usuarioCorrecto = true;
  }
}

interface dataPersona {
  numeroDocumento : string,
  clave : string,
  nombres : string,
  apellidos :string,
  telefono : string, 
  direccion : string, 
  dependencia :string, 
  empleado :string
}
