package automation.hashmap;

import java.util.Scanner;

public class RovarspraketMain {
    public static void main(String[] args) {
        Rovarspraket rs = new Rovarspraket();
        Scanner scanner = new Scanner(System.in);
        String text;

        //While-loopen gör det möjligt att fortsätta läsa in text om och om igen
        while (true) {
            System.out.println("Ange text du vill konvertera till rövarspråket:");
            text = scanner.nextLine();
            System.out.println(rs.toRovarspraket(text));
        }

    }
}