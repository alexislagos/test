import {Http} from '@angular/http';
import {Injectable} from '@angular/core';
import {RestClient} from './rest-client';
import {Contacto} from './../model/contacto.model';

@Injectable()
export class ContactoService extends RestClient<Contacto> {
    baseURL = "webresources/contactos/";
    contactos: Array<Contacto>;

    constructor(http: Http) {
        super(http);
    }
}
