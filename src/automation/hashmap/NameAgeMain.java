package automation.hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

// Skapa en HashMap för att lagra namn och ålder. Lägg till några namn och deras motsvarande ålder.
// Uppdatera programmet så att det skriver ut åldern på det namn man har läst in med Scanner och
// som matchar namn lagrade i din HashMap
public class NameAge {
    public static void main(String[] args) {
        // Skapar em Hashmap med namn som key (String) och en ålder (Integer) som värde
        HashMap<String,Integer> nameAge = new HashMap<>();
        // Fyller på 5 namn med åldrar
        nameAge.put("Kalle",31);
        nameAge.put("Olle",15);
        nameAge.put("Nisse",67);
        nameAge.put("Ville",33);
        nameAge.put("Pelle",12);
        // Skriver ut namnen från Hashmap
        for(String name: nameAge.keySet()) {
            System.out.println(name);
        }

        System.out.println(nameAge);
        // Frågar vilket namn mha scanner klassen som man vtill veta åldern på
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv ett namn du vill veta åldern på: ");
        // Lagrar namnet på sökta personen i variabeln name
        String name= scanner.nextLine();
        // Skriver ut åldern
        System.out.println(name +" är "+nameAge.get(name)+" år.");

    }
}
