"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var contacto_model_1 = require("./../model/contacto.model");
var contacto_service_1 = require("./../service/contacto.service");
var ContactoListComponent = (function () {
    function ContactoListComponent(service) {
        this.service = service;
        this.idTercero = 1;
        this.contactos = [];
        this.currentContact = new contacto_model_1.Contacto(0, "", "", "", this.idTercero);
        this.message = "";
    }
    ContactoListComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.service.findAll()
            .subscribe(function (result) { return _this.contactos = result; }, function (error) { return _this.message = "Error"; });
    };
    ContactoListComponent.prototype.editContact = function (contacto) {
        this.currentContact = contacto;
    };
    ContactoListComponent.prototype.removeContact = function (id) {
        var _this = this;
        this.service.remove(id)
            .subscribe(function (success) {
            var pos = _this.contactos.map(function (c) { return c.idContacto; }).indexOf(id);
            _this.contactos.splice(pos, 1);
        }, function (error) { return _this.message = "Error"; });
        this.message = 'Contacto eliminado';
    };
    ContactoListComponent.prototype.onNotify = function (contact) {
        if (contact != null) {
            if (this.currentContact && this.currentContact.idContacto != 0) {
                for (var i = 0; i < this.contactos.length; i++) {
                    if (this.contactos[i].idContacto == contact.idContacto) {
                        this.contactos[i] == contact;
                        break;
                    }
                }
            }
            else {
                this.contactos.push(contact);
            }
        }
        this.currentContact = new contacto_model_1.Contacto(0, "", "", "", this.idTercero);
    };
    return ContactoListComponent;
}());
ContactoListComponent = __decorate([
    core_1.Component({
        moduleId: module.id,
        selector: 'contactos-list',
        templateUrl: 'contacto-list.component.html'
    }),
    __metadata("design:paramtypes", [contacto_service_1.ContactoService])
], ContactoListComponent);
exports.ContactoListComponent = ContactoListComponent;
//# sourceMappingURL=contacto-list.component.js.map