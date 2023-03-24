package ro.unibuc.hello.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ro.unibuc.hello.data.InformationRepository;
import ro.unibuc.hello.dto.Greeting;

@SpringBootTest
@Tag("IT")
class UserServiceTestIT {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Test
    void test_getUser_returnsUser() {
        // Arrange
        String name = "Stefan";

        // Act
        UserDto userDto = userService.getUser(name);

        // Assert
        Assertions.assertEquals(1, userDto.getId());
        Assertions.assertEquals("Stefan", userDto.getName());
        Assertions.assertEquals("stefan@mail.com", userDto.getEmail());
        Assertions.assertEquals("Brasov", userDto.getAddress());
        Assertions.assertEquals("074 888 943", userDto.getPhone());
    }
}