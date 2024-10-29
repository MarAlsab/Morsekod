package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextAnalyzerTest {

    @Test
    void numberOfRows(){
        TexttAnalyzer texttAnalyzer = new TexttAnalyzer();
        texttAnalyzer.lineInput("hej på er i klassen");
        texttAnalyzer.lineInput("hej på dig Tomas");
        texttAnalyzer.lineInput("hej på alla andra också");
        assertEquals(3,texttAnalyzer.getRows());
    }
}
