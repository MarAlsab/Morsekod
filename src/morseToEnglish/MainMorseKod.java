package morseToEnglish;

import java.util.*;

public class MainMorseKod {

    public static void main(String[] args) {
        MorseLogic morselogic = new MorseLogic();
        Scanner scan = new Scanner(System.in);

        //Loop för att hantera flera inmatningar
        while (true) {
            try { // testar koden nedan
                System.out.println("Ange morsekod eller text (Ange Stop om du vill avsluta.!)");
                String kod = scan.nextLine().trim();

                if (kod.equalsIgnoreCase("Stop")) { // om användaren skriver stop avslutas programmet
                    System.out.println(" Programmet avslutas.!");
                    break;
                }

                if (kod.isEmpty()) {// om användaren söker på tom sträng fortsätter programmet om.
                    System.out.println("Du behöver skriva bokstäver eller morsetecken");
                    continue;

                }

                String[] letters; // spara bokstav/tecken i array
                String converteratText = ""; // Lagrar resultatet
                //morse till text
                if (kod.charAt(0) == '.' || kod.charAt(0) == '-') {
                    letters = kod.split(" ");

                } else {
                    //Text till morsekod
                    letters = kod.split("");
                }

                //System.out.println(kod);
                //  System.out.println(Arrays.toString(letters));
                for (String letter : letters) { // loppar igenom varje tecken och lägger till de
                    // System.out.println(letter);
                    converteratText = converteratText.concat(morselogic.converter(letter.toUpperCase()));

                    if (morselogic.converter(letter.toUpperCase()) == null) { // om sökningen misslyckas
                        System.out.println("Fel: Okänt tecken" + letter );
                        continue; // hoppar över och kör med nästa
                    }
                   converteratText = converteratText.concat("");

                }

                System.out.println(" Ordet du skrev i kod blir " + converteratText);

            } catch (Exception e) {
                System.out.println("Ett oväntat fel inträffade: " + e.getMessage());// felmeddelande
            }
        }

        scan.close();
    }
}