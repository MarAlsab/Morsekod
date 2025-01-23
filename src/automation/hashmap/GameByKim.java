package automation.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class GameByKim {
    public static void main(String[] args) {
        HashMap<String, String> hd = new HashMap<>();
        hd.put("start", "Du står vid en väggren. Vart vill du gå? (norr/söder/öster)");
        hd.put("norr", "Du går norrut och stöter på ett stort stenblock, Du får gå tillbaka. Vart vill du gå nu? (söder/öster)");
        hd.put("söder", "Du hittar en mystisk grotta. Vill du gå in? (ja/nej)");
        hd.put("öster", "Du ser en glittrande sjö. Vill du simma över? (ja/nej)");
        hd.put("grotta", "Grottan är fylld av diamanter! Du vann spelet!");
        hd.put("sjö", "Du simmade över sjön och drunknade. Försök igen!");
        System.out.println("Välkommen till att hitta diamanten! Den gömmer sig på någon av vägarna. Du måste hitta rätt väg.");
        Scanner scanner = new Scanner(System.in);
        String plats = "start";
        while (true) {
            System.out.println(hd.get(plats));
            String val = scanner.nextLine().trim().toLowerCase();
            // System.out.println("Kontroll: Nuvarande plats: " + plats + ", Val: " + val); För att felsöka buggar
            if (plats.equals("start") && (val.equals("norr") || val.equals("söder") || val.equals("öster"))) {
            plats = val;
            } else if (plats.equals("norr")) {
                plats = "start";
            } else if (plats.equals("söder") && val.equals("ja")) {
                plats = "grotta";
            } else if (plats.equals("söder") && val.equals("nej")) {
                plats = "start";
            } else if (plats.equals("öster") && val.equals("ja")) {
                plats = "sjö";
            } else if (plats.equals("öster") && val.equals("nej")) {
                plats = "start";
            } else if (plats.equals("sjö")) {
                break;
            } else if (plats.equals("grotta")) {
                break;
            } else {
                System.out.println("Ogiltigt val. Försök igen.");
            }
        }
    }
}
