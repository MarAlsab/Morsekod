package automation.hashmap;

import automation.arraylist.NamesArrayList;
import java.util.HashMap;

public class HashMapPlay {
    public static void main(String[] args) {
        HashMap<Integer, NamesArrayList> ageNames = new HashMap<>();
        System.out.println(ageNames);
        NamesArrayList namesArrayList = new NamesArrayList(); // tom så här långt
        // Fyller på med 2 namn
        namesArrayList.addName("Calle");
        namesArrayList.addName("Olle");
        // använder metoden i NamesArraylist för att skriva ut namnet
        System.out.println(namesArrayList.writeNames());
        ageNames.put(50,namesArrayList); // Säger att vår namesArrayList alla är 50 år
        NamesArrayList names50years = ageNames.get(50); // plockar ut en lista med de som är 50 år
        System.out.println(names50years.writeNames()); // skriver ut alla 50 åringar
    }
}
