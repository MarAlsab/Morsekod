package automation.hashmap;

import java.util.HashMap;

public class NameAge {
    private HashMap<String,Integer> nameAge = new HashMap<>();
    // Fyller på 5 namn med åldrar
    NameAge() {
        this.nameAge.put("Kalle", 31);
        nameAge.put("Olle", 15);
        nameAge.put("Nisse", 67);
        nameAge.put("Ville", 33);
        nameAge.put("Karl Bertil", 12);
    }

    public int getAge(String name) {
        return nameAge.get(name);
    }
}
