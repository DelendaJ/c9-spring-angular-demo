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
  artists = [];
  inputArtist = "";

  constructor(private artistService: ArtistService){}

  ngOnInit():void {
    this.artistService.getAll()
      .subscribe((artist:Array<Artist>) =>{
        console.log(artist);
        this.artists = artist;
      })
  }

  addHero(){
    if (this.inputArtist !=""){
      console.log(this.inputArtist);
      let artist:Artist = new Artist();
      artist.name = this.inputArtist;
      this.inputArtist = "";
      this.artistService.create(artist)
        .subscribe((artist:Array<Artist>) =>{
        console.log(artist);
        this.artists = artist;
      })
    }
  }
}
