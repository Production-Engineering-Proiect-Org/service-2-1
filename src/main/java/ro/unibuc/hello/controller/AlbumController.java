package ro.unibuc.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import ro.unibuc.hello.data.AlbumEntity;
import ro.unibuc.hello.exception.EntityNotFoundException;
import ro.unibuc.hello.service.AlbumService;

@RestController
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping("/album")
    public List<AlbumEntity> album() throws EntityNotFoundException {
        return albumService.getAllAlbums();
    }
}