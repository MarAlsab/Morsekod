package oop;

import java.util.Scanner;

public class CalculatorMain {

    static Scanner scanner = new Scanner(System.in);
    static Calculator calc;

    public static void main(String[] args) {
        updateNumbers();
        int choice;
        do {
            System.out.println("Vad vill du göra?");
            System.out.println("1 Addera");
            System.out.println("2 Subtrahera");
            System.out.println("3 Multiplicera");
            System.out.println("4 Dividera");
            System.out.println("8 Uppdatera talen");
            System.out.println("9 Avsluta");
            choice = scanner.nextInt();
            if (choice == 1) System.out.println(calc.add());
            if (choice == 2) System.out.println(calc.sub());
            if (choice == 3) System.out.println(calc.mult());
            if (choice == 4) System.out.println(calc.div());
            if (choice == 8) updateNumbers();
        } while (choice != 9);
    }

    private static void updateNumbers(){
        System.out.print("Skriv in tal 1 ");
        int tal1 = scanner.nextInt();
        System.out.print("Skriv in tal 2 ");
        int tal2 = scanner.nextInt();
        if (calc != null) calc.setNumbers(tal1,tal2);
        else calc = new Calculator(tal1, tal2);
    }
}
