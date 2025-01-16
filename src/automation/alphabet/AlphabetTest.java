package automation.alphabet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlphabetTest {
    @Test
    public void charToInt(){
        ConvertAlphabet convertAlphabet = new ConvertAlphabet();
        assertEquals(convertAlphabet.convertFromCharToInt('A'),1);
    }

    @Test
    public void intToChar(){
        ConvertAlphabet convertAlphabet = new ConvertAlphabet();
        assertEquals(convertAlphabet.convertFromIntToChar(1),'A');
    }

}
