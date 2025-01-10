package automation.ovning1extra;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// 1. Skriv ett program som läser in heltal med Scanner-metoden nextInt().
// Fånga InputMismatchException om användaren skriver något som inte är ett heltal

// 2. Läs in fem heltal och lägg dem i en array. Se till att inläsningen pågår
//  tills det att användaren har fyllt i fem heltal.
// Användaren ska få ett tydligt felmeddelande om den skriver fel.

public class IntegerArray {
    public static void main(String[] args) {
        int number = 0;
        int[] integerArray = new int[5];
        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    number = readInt();
                    break;
                } catch (InputMismatchException ime) {
                    System.out.println("Du skrev inget heltal");
                }
            }
            System.out.println("Vårt inlästa nummer är: " + number);
            integerArray[i] = number;
        }
        System.out.println(Arrays.toString(integerArray));
    }

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ett nummer: ");
        return scanner.nextInt();
    }
}
