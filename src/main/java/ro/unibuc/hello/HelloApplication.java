package ro.unibuc.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


import ro.unibuc.hello.data.InformationEntity;
import ro.unibuc.hello.data.InformationRepository;
import ro.unibuc.hello.data.AlbumRepository;
import ro.unibuc.hello.data.AlbumEntity;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "ro.unibuc.hello.data")
public class HelloApplication {

	@Autowired
	private InformationRepository informationRepository;
    
    @Autowired
    private AlbumRepository albumRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@PostConstruct
	public void runAfterObjectCreated() {
		informationRepository.deleteAll();
		informationRepository.save(new InformationEntity("Overview",
				"This is an example of using a data storage engine running separately from our applications server"));
		
		
		albumRepository.deleteAll();
		albumRepository.save(new AlbumEntity("Happy", "John Smith", 2000, 63));
		albumRepository.save(new AlbumEntity("Mistery","Jarry Laster",1989,90));
		albumRepository.save(new AlbumEntity("Life","Anna Fraid",2001,80));
	}
	
}