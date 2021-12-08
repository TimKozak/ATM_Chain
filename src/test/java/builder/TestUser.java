package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUser {
    User user;


    @BeforeEach
    void setUp() {
        user = User.builder()
                .firstName("Tima")
                .lastName("Kozak")
                .age(30)
                .occupation("FrontEnd")
                .build();
    }

    @Test
    void checkAttributes() {
        assertEquals(user.toString(), "User{firstName='Tima', lastName='Kozak'}");
    }
}
