package ro.unibuc.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import ro.unibuc.hello.data.ArtistEntity;
import ro.unibuc.hello.exception.EntityNotFoundException;
import ro.unibuc.hello.service.ArtistService;

@RestController
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @GetMapping("/artist")
    public List<ArtistEntity> artist() throws EntityNotFoundException {
        return artistService.getAllArtists();
    }
}
