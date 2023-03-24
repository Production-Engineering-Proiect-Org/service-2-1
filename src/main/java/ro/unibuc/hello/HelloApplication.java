package ro.unibuc.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import ro.unibuc.hello.data.ArtistRepository;
import ro.unibuc.hello.data.ArtistEntity;
import ro.unibuc.hello.data.InformationEntity;
import ro.unibuc.hello.data.InformationRepository;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "ro.unibuc.hello.data")
public class HelloApplication {

	@Autowired
	private InformationRepository informationRepository;
    @Autowired
    private ArtistRepository artistRepository;
	@Autowired
    private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@PostConstruct
	public void runAfterObjectCreated() {
		informationRepository.deleteAll();
		informationRepository.save(new InformationEntity("Overview",
				"This is an example of using a data storage engine running separately from our applications server"));
		
		artistRepository.deleteAll();
		artistRepository.save(new ArtistEntity("John Smith", "Arizona", "jazz", "Happy"));
		artistRepository.save(new ArtistEntity("Jarry Laster","Chicago","rock", "Mistery"));
		artistRepository.save(new ArtistEntity("Anna Fraid","Pensylvenia","dance","Welcome to the party"));

		userRepository.deleteAll();
		userRepository.save(new UserEntity("Stefan","stefan@mail.com","Brasov","074 888 943"));
		userRepository.save(new UserEntity("Andrei","andrei@mail.com","Bucuresti","074 999 943"));
		userRepository.save(new UserEntity("Ioana","ioana@mail.com","Timisoara","074 000 943"));
	}
	
}
