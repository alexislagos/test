import { NgModule }         from '@angular/core';
import { BrowserModule }    from '@angular/platform-browser';
import { FormsModule }      from '@angular/forms';
import { HttpModule, JsonpModule } from '@angular/http';

import { ContactoListComponent } from './contacto/contacto-list.component';
import { ContactoFormComponent } from './contacto/contacto-form.component';

import { ContactoService } from './service/contacto.service';

import { AppComponent }  from './app.component';

@NgModule({
  imports:      [ BrowserModule, FormsModule, HttpModule, JsonpModule ],
  declarations: [ AppComponent, ContactoListComponent, ContactoFormComponent ],
  bootstrap:    [ AppComponent ],
  providers:    [ ContactoService ],
})
export class AppModule { }
