package com.codedifferently.genius.repositories;

import com.codedifferently.genius.models.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
