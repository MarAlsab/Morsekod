package automation.switchweekdays;

import java.util.InputMismatchException;
import java.util.Scanner;

// Skapa ett program där användaren matar in en siffra (1-7)
// och programmet använder en switch-sats för att skriva ut
// motsvarande dag i veckan (1 är Måndag, 2 är Tisdag, etc.).
public class Weekdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day=0;
        while (day != 8) {
            System.out.print("Vilken veckodag vill du veta namnet på, 8 avsluta: ");
            try {
                day = scanner.nextInt();
                String weekday = getWeekday(day);
            } catch (InputMismatchException e) {
                System.out.println("Du måste mata in en siffra");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Något går fel");
            }
        }
    }

    public static String getWeekday(int day){
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            default: return "";
        }
    }

}
