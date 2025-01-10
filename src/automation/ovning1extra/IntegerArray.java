package automation.ovning1extra;

import java.util.InputMismatchException;
import java.util.Scanner;

// 1. Skriv ett program som läser in heltal med Scanner-metoden nextInt().
// Fånga InputMismatchException om användaren skriver något som inte är ett heltal

public class IntegerArray {
    public static void main(String[] args) {
        int number = 0;
        try {
            number = readInt();
        } catch (InputMismatchException ime) {
            System.out.println("Du skrev inget heltal");
        }
        System.out.println("Vårt inlästa nummer är: " + number);
    }

    private static int readInt() {
        Scanner scanner = new Scanner(System.in));
        System.out.print("Skriv in ett nummer: ");
        return scanner.nextInt();
    }
}
