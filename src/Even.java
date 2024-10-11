public class Even {
    // 13.Skapa ett program som har ett tal och skriver ut om det är jämnt. (Använd
    //modulooperatorn)

    public static void main(String[] args) {
        byte x = 3; // 0011 = 3  // 0010 = 2. // 0001 =1
        if (x % 2 == 0) System.out.println("even");
        if (x % 2 != 0) System.out.println("odd");

        // Överkurs
        // 0010.  =2
        // 0001.  =1
        // -------
        // 0000.  =0

        if ((x & 1) ==0 ) System.out.println("even");
    }

}
