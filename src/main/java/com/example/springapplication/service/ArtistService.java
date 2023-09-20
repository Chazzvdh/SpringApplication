package com.example.springapplication.service;

import com.example.springapplication.domain.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springapplication.repository.ArtistRepository;

import java.util.List;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAllArtists() {
        List<Artist> artists = artistRepository.findAll();
        System.out.println(artists);
        return artists; // Return the list of artists as a JSON response
    }
}
