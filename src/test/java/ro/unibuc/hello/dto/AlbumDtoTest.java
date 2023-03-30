package ro.unibuc.hello.dto;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class AlbumDtoTest {

    @Test
    public void AlbumTest() {
        
        AlbumDto album = new AlbumDto(1, "Abbey Road", "The Beatles");
        assertEquals(1, album.getId());
        assertEquals("Abbey Road", album.getName());
        assertEquals("The Beatles", album.getArtist());
        album.setId(2);
        album.setName("Sgt. Pepper's Lonely Hearts Club Band");
        assertEquals(2, album.getId());
        assertEquals("Sgt. Pepper's Lonely Hearts Club Band", album.getName());
    }
}
