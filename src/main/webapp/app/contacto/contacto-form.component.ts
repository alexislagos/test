import {Component, OnInit, Input, Output, EventEmitter} from '@angular/core';
import {ContactoService} from './../service/contacto.service';
import {Contacto} from './../model/contacto.model';

@Component({
    moduleId: module.id,
    selector: 'contacto-form',
    templateUrl: 'contacto-form.component.html'
})
export class ContactoFormComponent implements OnInit {
    @Output() notify: EventEmitter<Contacto> = new EventEmitter<Contacto>();
    @Input() contacto: Contacto;
    message: string = "";
    errors = {nameContact: false, phone: false, relation: false};

    constructor(
        private service: ContactoService
    ) {}

    ngOnInit() {
    }
    
    validContact(): boolean {
        this.errors.nameContact = !(this.contacto.nombreContacto);
        this.errors.phone = !(this.contacto.telefonoContacto);
        this.errors.relation = !(this.contacto.relacion);
        
        return !this.errors.nameContact && !this.errors.phone && !this.errors.relation;
    }

    saveContact() {
        if(!this.validContact())
            return;
            
        if (this.contacto.idContacto && this.contacto.idContacto != 0) {
            this.service.edit(this.contacto)
                .subscribe(
                    success => {
                        this.message = 'Contacto modificado exitosamente.';
                        this.notify.emit(this.contacto);
                    },
                    error => this.message = 'Error: ' + error
                );
        } else {
            this.service.create(this.contacto)
                .subscribe(
                    success => {
                        this.message = 'Contacto agregado exitosamente.';
                        this.notify.emit(success);
                    },
                    error => this.message = 'Error: ' + error
                );
        }
    }
    
    clearForm(){
        this.errors.nameContact = false;
        this.errors.phone = false;
        this.errors.relation = false;
        this.notify.emit(null);
    }
}