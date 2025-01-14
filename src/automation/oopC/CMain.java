package automation.oopC;

public class CMain {
    public static void main(String[] args) {
      CSubClass csc = new CSubClass("invärde");
        System.out.println(csc.getcText());
        csc.setcText("Ny text för klass c");
        System.out.println(csc.getcText());
    }
}
