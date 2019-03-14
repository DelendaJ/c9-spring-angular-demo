import { Component } from '@angular/core';
import {ArtistService} from './artist.service';
import {Artist} from "./models/artist";
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  constructor(private artistService: ArtistService){}

  ngOnInit():void {
    this.artistService.getAll()
      .subscribe((artist:Array<Artist>) =>{
        console.log(artist);
      })
  }
}
