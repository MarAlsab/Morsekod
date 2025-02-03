package morseToEnglish;

import java.util.HashMap;

public class MorseLogic {


    public HashMap<String, String> morseMap;

    public MorseLogic() {
        morseMap = new HashMap<>();

        // skapar en Hashmap med morsekod till bokstaver och fån bokstaver till mmorsekod.
        morseMap.put("A", ".-");
        morseMap.put(".-", "A");
        morseMap.put("B", "-...");
        morseMap.put("-...", "B");
        morseMap.put("C", "-.-.");
        morseMap.put("-.-.", "C");
        morseMap.put("D", "-..");
        morseMap.put("-..", "D");
        morseMap.put("E", ".");
        morseMap.put(".", "E");
        morseMap.put("F", "..-.");
        morseMap.put("..-.", "F");
        morseMap.put("G", "--.");
        morseMap.put("--.", "G");
        morseMap.put("H", "....");
        morseMap.put("....", "H");
        morseMap.put("I", "..");
        morseMap.put("..", "I");
        morseMap.put("J", ".---");
        morseMap.put(".---", "J");
        morseMap.put("K", "-.-");
        morseMap.put("-.-", "K");
        morseMap.put("L", ".-..");
        morseMap.put(".-..", "L");
        morseMap.put("M", "--");
        morseMap.put("--", "M");
        morseMap.put("N", "-.");
        morseMap.put("-.", "N");
        morseMap.put("O", "---");
        morseMap.put("---", "O");
        morseMap.put("P", ".--.");
        morseMap.put(".--.", "P");
        morseMap.put("Q", "--.-");
        morseMap.put("--.-", "Q");
        morseMap.put("R", ".-.");
        morseMap.put(".-.", "R");
        morseMap.put("S", "...");
        morseMap.put("...", "S");
        morseMap.put("T", "-");
        morseMap.put("-", "T");
        morseMap.put("U", "..-");
        morseMap.put("..-", "U");
        morseMap.put("V", "...-");
        morseMap.put("...-", "V");
        morseMap.put("W", ".--");
        morseMap.put(".--", "W");
        morseMap.put("X", "-..-");
        morseMap.put("-..-", "X");
        morseMap.put("Y", "-.--");
        morseMap.put("-.--", "Y");
        morseMap.put("Z", "--..");
        morseMap.put("--..", "Z");


    }

    public String converter(String key) {
        return morseMap.get(key);


    }
    public String handleInput(String input) {
        if (input.equalsIgnoreCase("Stop")) {
            return "Programmet avslutas.!";
        }
        return converter(input);
    }

}

