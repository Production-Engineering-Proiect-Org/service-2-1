package ro.unibuc.hello.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.unibuc.hello.data.UserEntity;


@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
    UserEntity findByName(String name);
}