public class OneCharAtTime {
    // 34.Skapa ett program som har en text och skriver ut ett tecken i taget tills en * skrivs in.


    public static void main(String[] args) {
        String text = "Ni är bästa klassen vi har så roligt* eller hur?";
        // System.out.println("textens längd är: "+text.length());

//        for (int i = 0; i < text.length() ; i++){
//            char tecken = text.charAt(i);
//            if (tecken == '*') break;
//            System.out.print(tecken);
//        }

        int j=0;
        boolean fortsatt = text.charAt(j) != '*';
        while (fortsatt){
            System.out.print(text.charAt(j));
            j++;
            fortsatt =  text.charAt(j) != '*';
        }

    }
}
