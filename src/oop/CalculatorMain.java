package oop;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv in tal 1 ");
        int tal1 = scanner.nextInt();
        System.out.print("Skriv in tal 2 ");
        int tal2 = scanner.nextInt();

        Calculator calc = new Calculator(tal1,tal2);

        System.out.println("Vad vill du göra?");
        System.out.println("1 Addera");
        System.out.println("2 Subtrahera");
        System.out.println("3 Multiplicera");
        System.out.println("4 Dividera");
        int choice = scanner.nextInt();
        if (choice == 1) System.out.println(calc.add());
        if (choice == 2) System.out.println(calc.sub());
        if (choice == 3) System.out.println(calc.mult());
        if (choice == 4) System.out.println(calc.div());
    }
}
