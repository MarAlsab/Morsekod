package automation.oop;

// Skapa en klass som representerar ett djur (t.ex. Frog)
//Lägg till en konstruktor till klassen med en parameter för djurets namn
//Spara djurets namn i ett attribut
//Skapa en metod som skriver ut djurets namn
//Lägg till en metod som representerar ett enkelt beteende (t.ex. Jump) för djuret som skrivs ut
public class Frog extends Animal {

    Frog(String name,int age) {
        super(name,age);
    }

    @Override
    public void behavior() {
        System.out.println("jump");
    }

    public void behavior(int length, int nmbOfJumps){
        System.out.println(length*nmbOfJumps);
    }
}
