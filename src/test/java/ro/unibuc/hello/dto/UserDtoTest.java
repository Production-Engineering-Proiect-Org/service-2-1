package ro.unibuc.hello.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDtoTest {

    UserDto myUserDto = new UserDto(1, "Stefan","stefan@mail.com","Brasov","074 888 943");

    @Test
    void test_id(){
        Assertions.assertEquals(1, myUserDto.getId());
    }

    @Test
    void test_name(){
        Assertions.assertSame("Stefan", myUserDto.getName());
    }

    @Test
    void test_email(){
        Assertions.assertSame("stefan@mail.com", myUserDto.getEmail());
    }
    
    @Test
    void test_phone(){
        Assertions.assertSame("Brasov", myUserDto.getPhone());
    }

    @Test
    void test_address(){
        Assertions.assertSame("074 888 943", myUserDto.getAddress());
    }

}