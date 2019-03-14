import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpClientModule } from "@angular/common/http";
import { AppComponent } from './app.component';
import {ArtistService} from './artist.service';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ArtistService],
  bootstrap: [AppComponent]
})
export class AppModule { }
