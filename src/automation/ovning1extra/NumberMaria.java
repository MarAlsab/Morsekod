package automation.ovning1extra;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberMaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5]; // Array med plats för 5 heltal
        int inputErrors = 0; //Antal InputMismatchExceptions
        int indexErrors = 0; // Antal ArrayIndexOutOfBoundsExceptions
        System.out.println("Ange fem heltal: ");
        for (int i = 0; i < numbers.length; i++) { // Loopar igenom arrayen tills fem heltal angivits
            while (true) { // Loop som körs tills ett godkänt heltal anges
                System.out.println("Ange heltal nummer " + (i + 1) + ": ");
                try {
                    numbers[i] = scan.nextInt(); // Läser in heltal och lagrar i arrayen
                    break; // Avbryter loop vid giltig inmatning
                } catch (InputMismatchException exc) {
                    inputErrors++;
                    System.out.println("Du måste ange ett heltal.");
                    scan.next(); // Rensar scannern
                }
            }
        }
        while (true) { // Loop som körs tills användaren väljer att stoppa programmet
            System.out.println("Ange index för att visa talet eller skriv 'stop' för att avsluta programmet: ");
            try {
                if (scan.hasNextInt()) { // Kontrollerar om nästa inmatning är ett heltal
                    int index = scan.nextInt(); // Läser in index
                    System.out.println("Talet på index " + index + " är: " + numbers[index]);
                } else if (scan.hasNext("stop")) { // Kontrollerar om användaren skrivit stop
                    System.out.println("Programmet avslutas...");
                    break; // Avbryter loopen och avslutar programmet
                } else {
                    inputErrors++;
                    System.out.println("Ogiltig inmatning... Du måste ange index eller skriva 'stop'.");
                    scan.next(); // Rensar scannern
                }
            } catch (ArrayIndexOutOfBoundsException exc) {
                indexErrors++;
                System.out.println("Ange index (0-4)");
            }
        }
        System.out.println("Antal ogiltiga inmatningar (InputMismatchException): " + inputErrors);
        System.out.println("Antal ogiltiga index (ArrayIndexOutOfBoundsException): " + indexErrors);
        scan.close();
    }
}