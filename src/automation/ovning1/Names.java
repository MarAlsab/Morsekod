package automation.ovning1;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        // Följande array finns i ditt program: String[] names = {"Ada", "Beda", "Cålle"};
        //1. Läs in ett tal som beskriver vilket namn man skall skriva ut i ordningen.
        // Fånga eventuella exceptions

        String[] names = {"Ada", "Beda", "Cålle"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in ett tal som beskriver vilket namn man skall skriva ut i ordningen: ");
        try {
            int number = scanner.nextInt();
            // int number = Integer.parseInt(scanner.nextLine());
            System.out.println(names[number - 1]);
        } catch (Exception exception){
            System.out.println("Vi får följande fel:");
            System.out.println(exception);
        }
    }
}
