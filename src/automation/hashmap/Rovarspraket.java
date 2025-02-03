package automation.hashmap;

import java.util.HashMap;

public class Rovarspraket {
    //rovarspraket HashMap initieras här för att göra den tillgänglig i metoden toRovarspraket()
    private HashMap<Character, String> rovarspraket = new HashMap<>();

    //I konstruktorn läggs nyckar och attribut in i vår HashMap
    Rovarspraket() {
        //Gemener
        rovarspraket.put('b', "bob");
        rovarspraket.put('c', "coc");
        rovarspraket.put('d', "dod");
        rovarspraket.put('f', "fof");
        rovarspraket.put('g', "gog");
        rovarspraket.put('h', "hoh");
        rovarspraket.put('j', "joj");
        rovarspraket.put('k', "kok");
        rovarspraket.put('l', "lol");
        rovarspraket.put('m', "mom");
        rovarspraket.put('n', "non");
        rovarspraket.put('p', "pop");
        rovarspraket.put('q', "qoq");
        rovarspraket.put('r', "ror");
        rovarspraket.put('s', "sos");
        rovarspraket.put('t', "tot");
        rovarspraket.put('v', "vov");
        rovarspraket.put('w', "wow");
        rovarspraket.put('x', "xox");
        rovarspraket.put('z', "zoz");

        //Versaler
        rovarspraket.put('B', "Bob");
        rovarspraket.put('C', "Coc");
        rovarspraket.put('D', "Dod");
        rovarspraket.put('F', "Fof");
        rovarspraket.put('G', "Gog");
        rovarspraket.put('H', "Hoh");
        rovarspraket.put('J', "Joj");
        rovarspraket.put('K', "Kok");
        rovarspraket.put('L', "Lol");
        rovarspraket.put('M', "Mom");
        rovarspraket.put('N', "Non");
        rovarspraket.put('P', "Pop");
        rovarspraket.put('Q', "Qoq");
        rovarspraket.put('R', "Ror");
        rovarspraket.put('S', "Sos");
        rovarspraket.put('T', "Tot");
        rovarspraket.put('V', "Vov");
        rovarspraket.put('W', "Wow");
        rovarspraket.put('X', "Xox");
        rovarspraket.put('Z', "Zoz");
    }

    public String toRovarspraket(String text) {
        //Tömmer strängen varje gång metoden körs
        String translatedText = "";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            //Om tecknet finns i HashMapen så hämtas bokstavens värde och läggs till i strängen
            //Om tecknet INTE finns i HashMapen så läggs det till som det är, oförändrat
            if (rovarspraket.containsKey(currentChar)) {
                translatedText = translatedText.concat(rovarspraket.get(currentChar));

            } else {
                translatedText = translatedText.concat(String.valueOf(currentChar));
            }

        }

        return translatedText;
    }
}