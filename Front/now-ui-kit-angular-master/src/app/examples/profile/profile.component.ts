import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ConsultasService } from 'app/services/consultas.service';
import * as Rellax from 'rellax';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss']
})
export class ProfileComponent implements OnInit {
  zoom: number = 14;
  lat: number = 44.445248;
  lng: number = 26.099672;
  styles: any[] = [{"featureType":"water","elementType":"geometry","stylers":[{"color":"#e9e9e9"},{"lightness":17}]},{"featureType":"landscape","elementType":"geometry","stylers":[{"color":"#f5f5f5"},{"lightness":20}]},{"featureType":"road.highway","elementType":"geometry.fill","stylers":[{"color":"#ffffff"},{"lightness":17}]},{"featureType":"road.highway","elementType":"geometry.stroke","stylers":[{"color":"#ffffff"},{"lightness":29},{"weight":0.2}]},{"featureType":"road.arterial","elementType":"geometry","stylers":[{"color":"#ffffff"},{"lightness":18}]},{"featureType":"road.local","elementType":"geometry","stylers":[{"color":"#ffffff"},{"lightness":16}]},{"featureType":"poi","elementType":"geometry","stylers":[{"color":"#f5f5f5"},{"lightness":21}]},{"featureType":"poi.park","elementType":"geometry","stylers":[{"color":"#dedede"},{"lightness":21}]},{"elementType":"labels.text.stroke","stylers":[{"visibility":"on"},{"color":"#ffffff"},{"lightness":16}]},{"elementType":"labels.text.fill","stylers":[{"saturation":36},{"color":"#333333"},{"lightness":40}]},{"elementType":"labels.icon","stylers":[{"visibility":"off"}]},{"featureType":"transit","elementType":"geometry","stylers":[{"color":"#f2f2f2"},{"lightness":19}]},{"featureType":"administrative","elementType":"geometry.fill","stylers":[{"color":"#fefefe"},{"lightness":20}]},{"featureType":"administrative","elementType":"geometry.stroke","stylers":[{"color":"#fefefe"},{"lightness":17},{"weight":1.2}]}];
    data : Date = new Date();
    focus;
    focus1;

    
    
    
    
    dataUsuario : any;
    dataTramite : dataTramite;
    tramiteAgregado : boolean;
    agregaTramite : boolean;
    consultarTramite : boolean;
    listadoTramites : any;

    constructor(private service: ConsultasService, private activateRouter : ActivatedRoute) { 
      
    }

    ngOnInit() {
      var rellaxHeader = new Rellax('.rellax-header');

        var body = document.getElementsByTagName('body')[0];
        body.classList.add('profile-page');
        var navbar = document.getElementsByTagName('nav')[0];
        navbar.classList.add('navbar-transparent');
        this.tramiteAgregado = false;
        this.consultarTramite = false;
        this.agregaTramite = false;
        
        this.activateRouter.queryParams.filter(params => params.nombre).subscribe(params =>{
          console.log(params);
          this.dataUsuario = params.nombre;
          console.log('this.dataUsuario',this.dataUsuario);
        })
    }

    ngOnDestroy(){
        var body = document.getElementsByTagName('body')[0];
        body.classList.remove('profile-page');
        var navbar = document.getElementsByTagName('nav')[0];
        navbar.classList.remove('navbar-transparent');
    }


    agregar( anoRadicacion,nombreTramite, descripcion, personaRadico, funcionarioRecibio){
      this.dataTramite = {
        anoRadicacion : anoRadicacion,
        nombreTramite : nombreTramite,
        descripcion : descripcion,
        personaRadico :personaRadico,
        funcionarioRecibio : funcionarioRecibio
      }

      this.service.crearTramite(this.dataTramite).subscribe(data=>{          
          console.log('dataTramite',data);
      })
      this.tramiteAgregado = true;      
    }

    agregarTramite(){
      this.agregaTramite = true;
    }

    consultaTramite(){
      this.consultarTramite = true;
      this.service.getTramites().subscribe(data=>{
        this.listadoTramites = data;
        console.log('this.listadoTramites',this.listadoTramites)
      })
    }

    volver(){
      this.consultarTramite = false;
      this.agregaTramite = false;
      this.tramiteAgregado = false;
    }

}


interface dataTramite {
  anoRadicacion : number,
  nombreTramite : string,
  descripcion : string,
  personaRadico :string,
  funcionarioRecibio : string
}
