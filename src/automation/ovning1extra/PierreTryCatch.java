package automation.ovning1extra;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PierreTryCatch {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange 5 heltal:");
        while (count < 5) {
            System.out.println("Ange heltal " + (count + 1) + ":");
            try {
                numbers[count] = scanner.nextInt();
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Nej, du måste ange ett heltal!");
                scanner.next();
            }
        }
        Arrays.sort(numbers);
        System.out.println("De angivna heltalen som du valt är: ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}