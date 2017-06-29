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
var contacto_service_1 = require("./../service/contacto.service");
var contacto_model_1 = require("./../model/contacto.model");
var ContactoFormComponent = (function () {
    function ContactoFormComponent(service) {
        this.service = service;
        this.notify = new core_1.EventEmitter();
        this.message = "";
        this.errors = { nameContact: false, phone: false, relation: false };
    }
    ContactoFormComponent.prototype.ngOnInit = function () {
    };
    ContactoFormComponent.prototype.validContact = function () {
        this.errors.nameContact = !(this.contacto.nombreContacto);
        this.errors.phone = !(this.contacto.telefonoContacto);
        this.errors.relation = !(this.contacto.relacion);
        return !this.errors.nameContact && !this.errors.phone && !this.errors.relation;
    };
    ContactoFormComponent.prototype.saveContact = function () {
        var _this = this;
        if (!this.validContact())
            return;
        if (this.contacto.idContacto && this.contacto.idContacto != 0) {
            this.service.edit(this.contacto)
                .subscribe(function (success) {
                _this.message = 'Contacto modificado exitosamente.';
                _this.notify.emit(_this.contacto);
            }, function (error) { return _this.message = 'Error: ' + error; });
        }
        else {
            this.service.create(this.contacto)
                .subscribe(function (success) {
                _this.message = 'Contacto agregado exitosamente.';
                _this.notify.emit(success);
            }, function (error) { return _this.message = 'Error: ' + error; });
        }
    };
    ContactoFormComponent.prototype.clearForm = function () {
        this.errors.nameContact = false;
        this.errors.phone = false;
        this.errors.relation = false;
        this.notify.emit(null);
    };
    return ContactoFormComponent;
}());
__decorate([
    core_1.Output(),
    __metadata("design:type", core_1.EventEmitter)
], ContactoFormComponent.prototype, "notify", void 0);
__decorate([
    core_1.Input(),
    __metadata("design:type", contacto_model_1.Contacto)
], ContactoFormComponent.prototype, "contacto", void 0);
ContactoFormComponent = __decorate([
    core_1.Component({
        moduleId: module.id,
        selector: 'contacto-form',
        templateUrl: 'contacto-form.component.html'
    }),
    __metadata("design:paramtypes", [contacto_service_1.ContactoService])
], ContactoFormComponent);
exports.ContactoFormComponent = ContactoFormComponent;
//# sourceMappingURL=contacto-form.component.js.map