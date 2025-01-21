package automation.arraylist;

// Spara dessa matematiska konstanter med sina första 10 decimaler i en ArrayList.
// Skriv sen ut alla genom att hämta dem ifrån ArrayListen
//
//Namn	Värde
//pi		3.1415926535
//e		2.7182818284
//sqrt2	1.4142135623
//phi		1.6180339887
//ln10		2.3025850929

import java.util.ArrayList;

public class MatematiskaKonstanter {
    public static void main(String[] args) {
        ArrayList<Double> constants = new ArrayList<>();
        constants.add(3.1415926535);
        constants.add(2.7182818284);
        constants.add(1.4142135623);
        constants.add(1.6180339887);
        constants.add(2.3025850929);
        System.out.println(constants);

    }
}
