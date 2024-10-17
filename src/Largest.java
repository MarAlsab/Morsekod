public class Largest {
    // 11.Skapa ett program där två tal finns och det
    // första talet skrivs ut om det är störst.

    public static void main(String[] args) {
        int x = 15; //  Heltal: int byte short long.  // decimaltal: double float // char boolean
        int y = 7;

        boolean xLargest = x > y;
        System.out.println(xLargest);

        if (xLargest) System.out.println("Första talet  är störst: " + x);

        if (x > y) {
            System.out.println("************");
            System.out.println("Första talet  är störst: " + x);
        }
        else System.out.println("Andra talet är störst: " + y);

        // Överkurs
//        System.out.println((x > y) ? x : y);

    }
}
