package ro.unibuc.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.unibuc.hello.data.AlbumEntity;
import ro.unibuc.hello.data.AlbumRepository;
import ro.unibuc.hello.dto.AlbumDto;
import java.util.List;
import ro.unibuc.hello.exception.EntityNotFoundException;
import java.util.concurrent.atomic.AtomicLong;
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
    public AlbumDto buildAlbumDtoFromAlbum(String title) throws EntityNotFoundException {
        AlbumEntity entity = albumRepository.findByTitle(title);
        if (entity == null) {
            throw new EntityNotFoundException(title);
        }
        return new AlbumDto(entity.id,entity.title, entity.artist);
    }
   
}