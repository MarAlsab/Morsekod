public class Square {
    // Skapa ett program som skriver ut kvadraten på ett tal (som läses in). Kvadrat är talet
    // multiplicerat med sig själv.

    public static void main(String[] args) {
        int heltal = 10;
        double decimaltal = 1.5;
        // int resultHeltal = heltal * heltal;
        int resultHeltal = (int) Math.pow(heltal,2);
        // double resultatDecimaltal = decimaltal * decimaltal;
        double resultatDecimaltal = Math.pow(decimaltal,2);
        String textSvarHeltal = "Kvadraten av heltalet "+heltal+" är : "+resultHeltal;

        System.out.println(textSvarHeltal);
        System.out.println("Kvadraten av decimaltalet "+ decimaltal+ " är : "+resultatDecimaltal);
    }

}
