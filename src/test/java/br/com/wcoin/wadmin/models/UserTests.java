package br.com.wcoin.wadmin.models;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserTests {

    @Test
    void validateUserProps(){
        
        User user = new User();

        user.setId(1);
        user.setName("Jean Evenx Joseph");
        user.setUsername("Jean");
        user.setEmail("jeanevenx@hotmail.com");
        user.setPassword("147@gjsm");
        user.setAvatar("http://avatarlink.net");

        assertEquals(1, user.getId());
        assertEquals("Jean Evenx Joseph", user.getName());
        assertEquals("Jean", user.getUsername());
        assertEquals("jeanevenx@hotmail.com", user.getEmail());
        assertEquals("147@gjsm", user.getPassword());
        assertEquals("http://avatarlink.net", user.getAvatar());

    }
    
}
