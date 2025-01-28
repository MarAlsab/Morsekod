package automation.guessnumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ett lägsta tal (inkluderat) ");
        int lowest = scanner.nextInt();
        System.out.print("Ange ett högsta tal (inkluderat) ");
        int highest = scanner.nextInt();
        Randomizer rand = new Randomizer(lowest,highest);
        String result ="";
        while (!result.equals("Du vann")){
            System.out.print("Gissa ett nummer ");
            int number = scanner.nextInt();
            result = rand.guess(number);
            System.out.println(result);
        }
    }
}
