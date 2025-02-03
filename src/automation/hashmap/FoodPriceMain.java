package automation.hashmap;
import java.util.Scanner;

public class FoodPriceMain {

    public static void main(String[] args) {
        FoodPriceLogic logic = new FoodPriceLogic(); // Skapar instans av logikklassen

        // Lägger till matvaror och deras priser
        logic.addFoodPrice("Äpplen", 20);
        logic.addFoodPrice("Bananer", 15);
        logic.addFoodPrice("Mjölk", 10);
        logic.addFoodPrice("Bröd", 25);
        logic.addFoodPrice("Ost", 50);
        logic.addFoodPrice("Kaffe", 40);
        logic.addFoodPrice("Smör", 30);

        Scanner scan = new Scanner(System.in);

        System.out.println("Ange matvara för att visa pris: ");
        String foodName = scan.nextLine();

        Integer price = logic.getPrice(foodName); // Hämtar pris från logikklassen

        // Skriver ut resultat
        if (price != -1) {
            System.out.println(foodName + " kostar " + price + " kr.");
        }
        else {
            System.out.println("Varan finns inte registrerad...");
        }
    }
}
