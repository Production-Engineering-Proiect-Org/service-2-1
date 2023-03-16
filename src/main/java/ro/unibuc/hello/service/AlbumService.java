package ro.unibuc.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.unibuc.hello.data.AlbumEntity;
import ro.unibuc.hello.data.AlbumRepository;

import java.util.List;


@Service
public class AlbumService {
    
    @Autowired
    private AlbumRepository albumRepository;
    
    public List<AlbumEntity> getAllAlbums() {
        List<AlbumEntity> listAlbums = albumRepository.findAll();

        return listAlbums;

    }

    public AlbumEntity createAlbum(AlbumEntity album) {
        return albumRepository.save(album);
    }
    
}