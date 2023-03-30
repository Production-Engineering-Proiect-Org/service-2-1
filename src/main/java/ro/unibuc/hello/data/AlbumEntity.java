package ro.unibuc.hello.data;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "albums")
public class AlbumEntity {
    @Id
    public int id;
    public String title;
    public String artist;
    public int year;
    public double price;

    public AlbumEntity(){}

    public AlbumEntity(int id,String title, String artist, int year, double price) {
        this.id=id;
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format(
                "Album[title='%s', artist='%s']",
                id, title, artist);
    }

}