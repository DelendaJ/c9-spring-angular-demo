import { Injectable } from '@angular/core';
import { Observable } from "rxjs/Observable";
import { HttpClient } from "@angular/common/http";
import {Artist} from "./models/artist";

@Injectable()
export class ArtistService {

  private readonly URL = "/api/artists"

  constructor(protected httpClient: HttpClient) { }

  getAll():Observable<Array<Artist>>{
    return this.httpClient.get<Array<Artist>>(`${this.URL}`);
  }
}
