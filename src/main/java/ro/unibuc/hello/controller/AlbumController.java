package ro.unibuc.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import ro.unibuc.hello.data.AlbumEntity;
import ro.unibuc.hello.exception.EntityNotFoundException;
import ro.unibuc.hello.service.AlbumService;
import ro.unibuc.hello.dto.AlbumDto;

@RestController
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping("/album")
    public List<AlbumEntity> album() throws EntityNotFoundException {
        return albumService.getAllAlbums();
    }
    @GetMapping("/album/{title}")
    @ResponseBody
    public AlbumDto info(@PathVariable("title") String title) throws EntityNotFoundException {
        return albumService.buildAlbumDtoFromAlbum(title);
    }

}