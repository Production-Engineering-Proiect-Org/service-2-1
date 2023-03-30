package ro.unibuc.hello.dto;

public class AlbumDto {

    private int id;
    private String name;
    private String artist;

    public AlbumDto() {
    }

    public AlbumDto(int id,String name, String artist) {
        this.id= id;
        this.name = name;
        this.artist= artist;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getArtist() {
        return artist;
    }

}

