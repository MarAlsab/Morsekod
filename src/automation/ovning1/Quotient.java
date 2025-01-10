package automation.ovning1;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        boolean validInput1 = false;
        boolean validInput2 = false;
        System.out.println("välj två tal för att få ut kvoten av dem");
        while (!validInput1) {
            try {
                System.out.println("Skriv in det första talet: ");
                number1 = Double.parseDouble(scanner.nextLine());
                validInput1 = true;
            } catch (NumberFormatException e) {
                System.out.println("Fel: Du kan endast skriva in tal");
                System.out.println(e);
            } catch (Exception e) {
                System.out.println("Något gick fel");
                System.out.println(e);
            }
        }
        while (!validInput2) {
            try {
                System.out.print("Skriv in det andra talet: ");
                number2 = Double.parseDouble(scanner.nextLine());
                if (number2 == 0) {
                    System.out.println("Fel: Du kan inte dela med noll.");
                } else {
                    validInput2 = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Fel: Du kan endast skriva in tal");
                System.out.println(e);
            } catch (Exception e) {
                System.out.println("Något gick fel");
                System.out.println(e);
            }
        }
        double result = number1 / number2;
        System.out.println("kvoten för talen är: " + result);
        scanner.close();
    }
}
