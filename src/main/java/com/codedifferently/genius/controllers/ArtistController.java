package com.codedifferently.genius.controllers;


import com.codedifferently.genius.models.Artist;
import com.codedifferently.genius.repositories.ArtistRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ArtistController {

    private final Logger logger = LoggerFactory.getLogger(ArtistController.class);

    private ArtistRepository artistRepository;

    @Autowired
    public ArtistController(ArtistRepository artistRepositoryIn){
        this.artistRepository = artistRepositoryIn;
    }

    @GetMapping("/artists")
    public Iterable<Artist> getAllArtist(){
        Iterable<Artist> artists = artistRepository.findAll();
        return artists;

     }

     @PostMapping("/artists")
    public Iterable<Artist> create(@RequestBody Artist artist){
        logger.info("Creating Artist " + artist.getName());
        artistRepository.save(artist);
        return artistRepository.findAll();
     }
}
