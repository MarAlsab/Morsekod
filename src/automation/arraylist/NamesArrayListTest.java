package automation.arraylist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NamesArrayListTest {
    @Test
    public void nameTest(){
        NamesArrayList names = new NamesArrayList();
        names.addName("Pelle");
        names.addName("Olle");
        names.addName("Nisse");
        names.addName("stop");
        names.addName("Tomas");
        assertEquals("Pelle Olle Nisse",names.writeNames());
        names.rename(0,"Ville");
        assertEquals("Ville Olle Nisse",names.writeNames());
        names.replaceFirstAndLast();
        assertEquals("Nisse Olle Ville",names.writeNames());
    }

    @Test
    public void nameTest2(){
        NamesArrayList names = new NamesArrayList();
        names.addName("Pelle");
        assertEquals("Pelle",names.writeNames());
        names.rename(0,"Ville");
        assertEquals("Ville",names.writeNames());
        names.replaceFirstAndLast();
        assertEquals("Ville",names.writeNames());
    }

}
