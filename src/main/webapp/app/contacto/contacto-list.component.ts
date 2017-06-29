import {Component, OnInit} from '@angular/core';
import {Contacto} from './../model/contacto.model';
import {ContactoService} from './../service/contacto.service';

@Component({
    moduleId: module.id,
    selector: 'contactos-list',
    templateUrl: 'contacto-list.component.html'
})
export class ContactoListComponent implements OnInit {
    idTercero: number = 1;
    contactos: Array<Contacto> = [];
    currentContact:Contacto = new Contacto(0, "", "", "", this.idTercero);
    message: string = "";
    
    constructor(private service: ContactoService){
        
    }
    
    ngOnInit() {
        this.service.findAll()
            .subscribe(
                result => this.contactos = result,
                error => this.message = "Error"
            );
    }
    
    editContact(contacto:Contacto){
        this.currentContact = contacto;
    }
    
    removeContact(id: number) {
        this.service.remove(id)
            .subscribe(
                success => {
                    let pos = this.contactos.map(c => c.idContacto).indexOf(id);
                    this.contactos.splice(pos,1);
                },
                error => this.message = "Error"
            );
            
        this.message = 'Contacto eliminado';
    }
    
    onNotify(contact: Contacto):void {
        if (contact != null){
            if (this.currentContact && this.currentContact.idContacto != 0) {
                for (let i = 0; i < this.contactos.length; i++) {
                    if (this.contactos[i].idContacto == contact.idContacto){
                        this.contactos[i] == contact;
                        break;
                    }
                }
            } else {
                this.contactos.push(contact);
            }
        }
        
        this.currentContact = new Contacto(0, "", "", "", this.idTercero);
    }
}