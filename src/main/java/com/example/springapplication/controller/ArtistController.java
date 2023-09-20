package com.example.springapplication.controller;

import com.example.springapplication.domain.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springapplication.service.ArtistService;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {
    @Autowired
    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/")
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }

    // Other CRUD operations
}

