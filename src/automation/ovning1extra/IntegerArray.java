package automation.ovning1extra;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// 1. Skriv ett program som läser in heltal med Scanner-metoden nextInt().
// Fånga InputMismatchException om användaren skriver något som inte är ett heltal

// 2. Läs in fem heltal och lägg dem i en array. Se till att inläsningen pågår
//  tills det att användaren har fyllt i fem heltal.
// Användaren ska få ett tydligt felmeddelande om den skriver fel.

// Try/catch
//
//3. Låt användaren välja vilket index de vill se av heltalen.
//  Hantera ArrayIndexOutOfBoundsException.
// Användaren ska kunna använda denna funktionalitet i all oändlighet.

public class IntegerArray {
    public static void main(String[] args) {
        int index = 0;
        int[] integerArray = new int[5];
        while (index < 5) {
            try {
                integerArray[index] = readInt();
                index++;
            } catch (InputMismatchException ime) {
                System.out.println("Du skrev inget heltal");
            }
        }
        System.out.println(Arrays.toString(integerArray));
        while (true) {
            System.out.print("Skriv en ordning 0-4 av arrayen för att se posten: ");
            try {
                System.out.println(integerArray[getOrder()]);
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("Fel inmatad post index");
            }
        }
    }

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ett nummer: ");
        return scanner.nextInt();
    }

    private static int getOrder() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
