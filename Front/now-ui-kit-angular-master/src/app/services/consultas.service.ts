import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {HttpParams } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
})

export class ConsultasService{

    constructor(private http:HttpClient){}

    urlBase='http://localhost:8080/';

    Url='http://localhost:8080/tramite/consultarTodosTramites';
    Urlusuario='http://localhost:8080/persona/consultaUsuario';


    crearPersona(object: any){
        return this.http.post(this.urlBase+'/persona/crearPersona',object)
    }

    crearTramite(object: any){
        return this.http.post(this.urlBase+'/tramite/crearTramite',object)

    }

    getTramites() {
        return this.http.get(this.Url);
    }


    consultausuario(usuario){
        const params = new HttpParams()
            .set('usuario', usuario.toString());
        return this.http.get(this.Urlusuario +'?'+'usuario=' + usuario);
    }

}
