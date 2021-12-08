package atm;

import builder.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestATM {
    ATM atm;


    @BeforeEach
    void setUp() {
        atm = new ATM();
    }

    @Test
    void checkAttributes() {
        assertEquals(atm.process(225), 11);
        assertEquals(atm.process(20), 1);
        assertEquals(atm.process(100), 5);
    }
}
