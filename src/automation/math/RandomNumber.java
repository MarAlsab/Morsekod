package automation.math;

import java.util.Scanner;

// Skapa ett program som genererar och skriver ut 10 slumpmässiga
// heltal mellan två av användaren angivna tal.

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ett lägsta tal (inkluderat) ");
        int lowest = scanner.nextInt();
        System.out.print("Ange ett högsta tal (inkluderat) ");
        int highest = scanner.nextInt();
        for (int i= 0;i<10; i++) System.out.println((int) (Math.random()*(highest-lowest+1))+lowest);
    }
}
