package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    void testOfUser(){
        User user = new User("tomas","abc123");
    }
}
