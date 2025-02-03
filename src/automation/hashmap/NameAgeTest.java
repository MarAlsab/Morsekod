package automation.hashmap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NameAgeTest {
    @Test
    public void villesAge(){
        NameAge nameAge = new NameAge();
        assertEquals(33,nameAge.getAge("Ville"));
    }
}
