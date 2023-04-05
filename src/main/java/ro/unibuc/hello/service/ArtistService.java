package ro.unibuc.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.unibuc.hello.data.ArtistEntity;
import ro.unibuc.hello.data.ArtistRepository;

import java.util.List;


@Service
public class ArtistService {
    
    @Autowired
    private ArtistRepository artistRepository;
    
    public List<ArtistEntity> getAllArtists() {
        List<ArtistEntity> listArtist = artistRepository.findAll();

        return listArtist;

    }

    public ArtistEntity createArtist(ArtistEntity artist) {
        return artistRepository.save(artist);
    }
    
}
