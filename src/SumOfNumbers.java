import java.util.Scanner;

public class SumOfNumbers {

    // 44.Skapa ett program som låter användaren bestämma hur många tal han vill summera.
    // Läs in detta antal tal och summera dem Skriv ut summan.

    private static Scanner scannerInput = new Scanner(System.in);

    public static void main(String[] args) {
        // Fakultet.main();
        System.out.print("Hur många tal vill du läsa in? ");
        int antalTal = scannerInput.nextInt();
        int sum = sumIntegers(antalTal);
        System.out.println("Summan av alla " + antalTal + " talen är " + sum);
    }

    private static int sumIntegers(int antalTal ){
        int sum = 0;
        for (int i = 0; i < antalTal; i++) {
            System.out.print("Skriv in ett tal? ");
            int tal = scannerInput.nextInt();
            sum = sum + tal;
        }
        return sum;
    }
}
