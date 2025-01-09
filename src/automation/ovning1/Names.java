package automation.ovning1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        // Följande array finns i ditt program: String[] names = {"Ada", "Beda", "Cålle"};
        //1. Läs in ett tal som beskriver vilket namn man skall skriva ut i ordningen.
        // Fånga eventuella exceptions
        // 2. Uppdatera ditt program så att det fångar exceptions vid olika tillfällen
        // (inläsning av tal respektive utskrift av namn)

        String[] names = {"Ada", "Beda", "Cålle"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ett tal som beskriver vilket namn man skall skriva ut i ordningen Variant 1: ");
        // Variant 1
        try {
            int number = scanner.nextInt();
            try {
                System.out.println(names[number]);
            } catch (Exception exception) {
                System.out.println(exception);
                System.out.println("Array Fel !!!");
            }
        } catch (Exception exception) {
            System.out.println(exception);
            System.out.println("Input Fel !!!");
        }
        System.out.print("Skriv in ett tal som beskriver vilket namn man skall skriva ut i ordningen Variant 2: ");

        // Variant 2
        try {
            int number = scanner.nextInt();
            System.out.println(names[number]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
            System.out.println("Array Fel !!!");

        } catch (InputMismatchException exception) {
            System.out.println(exception);
            System.out.println("Input Fel !!!");
        } catch (Exception exception) {
            System.out.println(exception);
            System.out.println("Annat Fel !!!");
        }
    }
}

