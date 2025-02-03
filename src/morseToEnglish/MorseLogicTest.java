package morseToEnglish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MorseLogicTest {

    
    MorseLogic morselogic = new MorseLogic();
   @Test
    void testTomInmatning() {
        assertNull(morselogic.converter(""), "Tom inmatning ska returnera null");

    }
    //Testa om man matar in special tecken

    @Test
    void testOgiltigInmatning() {
        assertNull(morselogic.converter("@"), "Ogiltigt tecken ska returnera null");
        assertNull(morselogic.converter("#"), "Ogiltigt tecken ska returnera null");
    }
    // Testa om man matar in siffror

    @Test
    void testSiffror() {
        assertNull(morselogic.converter("1"), "Siffror stöds inte och ska returnera null");
        assertNull(morselogic.converter("9"), "Siffror stöds inte och ska returnera null");
    }
    //Testa om morsekod ger ut bokstaver

    @Test
    void testMorseTillBokstav() {
        assertEquals("A", morselogic.converter(".-"), ".- ska konverteras till A");
        assertEquals("S", morselogic.converter("..."), "... ska konverteras till S");
        // Testa om bokstaver ger morsekod.
    }
        @Test
        void testBokstavTillMorse() {
            assertEquals(".-", morselogic.converter("A"), "A ska konverteras till .-");
            assertEquals("--..", morselogic.converter("Z"), "Z ska konverteras till --..");
        }
       @Test
    void testStopInmatning (){
            assertEquals("Programmet avslutas.!", morselogic.handleInput("Stop"));
        }
    }