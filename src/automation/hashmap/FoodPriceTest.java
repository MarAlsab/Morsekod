package automation.hashmap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodPriceTest {

    @Test
    public void testAddFoodPriceAndGetPrice() { // Testar att lägga till matvaror och priser samt hämta rätt pris för angiven vara

        FoodPriceLogic logic = new FoodPriceLogic(); // Skapar instans av logikklassen för att testa dess funktioner

        logic.addFoodPrice("Äpplen", 20); // Lägger till matvara och pris i hashmap
        logic.addFoodPrice("Bananer", 15);

        assertEquals(20, logic.getPrice("Äpplen")); // Kontrollerar att rätt pris returneras
        assertEquals(15, logic.getPrice("Bananer"));
    }

    @Test
    public void testGetPriceForWrongFood() { // Testar att metoden hanterar matvaror som inte finns på korrekt sätt

        FoodPriceLogic logic = new FoodPriceLogic(); // Skapar ny instans

        Integer price = logic.getPrice("Tomater"); // Försöker hämta pris för en matvara som inte finns

        assertEquals(-1, price); // Kontrollerar att -1 returneras för matvara som inte finns
    }
}

