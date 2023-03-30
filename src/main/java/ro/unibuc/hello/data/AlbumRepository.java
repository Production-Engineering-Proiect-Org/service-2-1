package ro.unibuc.hello.data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends MongoRepository<AlbumEntity, String> {
    AlbumEntity findByTitle(String title);
}