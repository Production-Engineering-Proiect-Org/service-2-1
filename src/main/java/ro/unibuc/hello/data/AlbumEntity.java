package ro.unibuc.hello.data;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "albums")
public class AlbumEntity {
    @Id
    private ObjectId id;
    private String title;
    private String artist;
    private int year;
    private double price;

    public AlbumEntity(){}

    public AlbumEntity(String title, String artist, int year, double price) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.price = price;
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
}