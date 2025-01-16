package automation.oop;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog("Boll",5);
        frog.writeName();
        frog.behavior();
        frog.behavior(2,3);
        Dog dog = new Dog("Lufsen",3);
        dog.writeName();
        dog.behavior();
    }
}
