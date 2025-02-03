package automation.hashmap;
import java.util.HashMap;

public class FoodPriceLogic {
    private HashMap<String, Integer> foodPriceMap; // Hashmap som lagrar matvaror och deras priser

    public FoodPriceLogic() { // Konstruktor som initierar hashmap
        foodPriceMap = new HashMap<>();
    }

    public void addFoodPrice(String foodName, int price) { // Metod för att lägga till matvara och pris
        foodPriceMap.put(foodName, price);
    }

    public Integer getPrice(String foodName) { // Metod för att hämta pris för angiven matvara
        if (foodPriceMap.containsKey(foodName)) {
            return foodPriceMap.get(foodName); // Om matvaran finns, returneras priset
        }
        else {
            return -1; // Returnera -1 om matvaran inte finns
        }
    }
}

