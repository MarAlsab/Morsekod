package automation.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Alfabet {

    public static void main(String[] args) {
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";

        // Skapa en HashMap där varje bokstav är en nyckel till korresponderande symbol i symbols.
        // Det kan vara enklare att spara dem som Character och använda metoden charAt för att
        // plocka ut bokstäverna
        HashMap<Character,Character> charConvert = new HashMap<>();
        for (int i=0; i < alfabet.length();i++){
            charConvert.put(alfabet.charAt(i),symbols.charAt(i));
        }
        System.out.println(charConvert);

        // Låt användaren läsa in ett ord med stora bokstäver och konvertera dem enligt listan i symbols
        // genom att hämta dem en efter en ifrån hashmappen.
        // Du kan använda charAt igen och System.out.print (istället för println)
        // för att skriva ut den konverterade texten
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv ett ord:");
        String line = scanner.nextLine();
        for (int i=0; i < line.length();i++){
            System.out.print(charConvert.get(line.toUpperCase().charAt(i)));
        }
    }
}
