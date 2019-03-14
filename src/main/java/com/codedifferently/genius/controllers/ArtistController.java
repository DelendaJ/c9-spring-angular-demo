package com.codedifferently.genius.controllers;


import com.codedifferently.genius.models.Artist;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ArtistController {

    @GetMapping("/artists")
    public List<Artist> getAllArtist(){
        List<Artist> allArtist = new ArrayList<>();
        Artist artist = new Artist(1l, "Rza");
        allArtist.add(artist);
        return allArtist;
     }
}
