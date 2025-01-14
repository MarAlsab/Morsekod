package automation.oopB;

import automation.oopA.AClass;

public class BMain {
    public static void main(String[] args) {
        AClass aClass = new AClass();
        System.out.println(aClass.textPublic);
        System.out.println(aClass.getTextPrivate());
        // Protected kommer visas här
        // men ej attributet text dvs utan access definierad
    }
}
/*
    Private:    visas bara i klassen
    ej def:     visas i klassen och i package men ej i subclass
                    (dvs BMain pga ligger i annan package)
    Protected:  visas i sub klasser och i hela package
    Public:     visas för alla

 */
