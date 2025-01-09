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

        // Variant 1
        System.out.print("Skriv in ett tal som beskriver vilket namn man skall skriva ut i ordningen Variant 1: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int number1 = scanner.nextInt();
            scanner.close();
            try {
                System.out.println(names[number1]);
            } catch (Exception exception) {
                System.out.println(exception);
                System.out.println("Array Fel !!!");
            }
        } catch (Exception exception) {
            System.out.println(exception);
            System.out.println("Input Fel !!!");
        }

        // Variant 2
        System.out.print("Skriv in ett tal som beskriver vilket namn man skall skriva ut i ordningen Variant 2: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int number2 = scanner.nextInt();
            scanner.close();
            System.out.println(names[number2]);
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

