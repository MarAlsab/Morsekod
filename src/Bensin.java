public class Bensin {
    // 7. Skapa ett program som beräknar vad du ska betala för en tank bensin. Indata är antal
    //liter, pris per liter och eventuell rabatt i procent. Utdata är priset som du ska betala

    public static void main(String[] args) {
        int antalLiter = 50;
        double literPris = 17.50;
        int rabattProcent = 10;

        double totalRabatt = antalLiter * literPris * rabattProcent / 100;
        System.out.println("totalRabatt " + totalRabatt);

        double totalaPriset = antalLiter * literPris - totalRabatt;
        System.out.println("totalaPriset " + totalaPriset);

        System.out.println("formel 2 " + (antalLiter * literPris) * (1 - (double) rabattProcent / 100));
    }
}
