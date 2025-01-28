package automation.calculator;

import java.util.Scanner;

// Skapa en enkel kalkylator som tar emot två tal och en operation
// (addition, subtraktion, multiplikation, division) från användaren.
// Använd en switch-sats för att bestämma vilken operation som ska
// utföras baserat på användarens input.
public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ett tal: ");
        int tal1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Skriv ett nytt tal: ");
        int tal2 = Integer.parseInt(scanner.nextLine());
        while (true) {
            System.out.println("Vilket räkneset vill du utföra, eller skriv avsluta");
            String rakneset = scanner.nextLine();
            switch (rakneset) {
                case "addition":
                    System.out.print(Calculator.addition(tal1, tal2));
                    break;
                case "subtraktion":
                    System.out.println(Calculator.subtraktion(tal1, tal2));
                    break;
                case "multiplikation":
                    System.out.println(Calculator.multiplikation(tal1, tal2));
                    break;
                case "division":
                    System.out.println(Calculator.division(tal1, tal2));
                    break;
                case"avsluta": System.exit(0);
            }
        }
    }

}
