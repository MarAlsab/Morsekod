package automation.oop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Frog frog = new Frog("Boll",5);
        frog.writeName();
        frog.behavior();
        frog.behavior(2,3);
        Dog dog = new Dog("Lufsen",3);
        dog.writeName();
        dog.behavior();

        Scanner scanner = new Scanner(System.in);
        Animal[] animals = new Animal[3];
        for (int i=0;i < 3;i++)  {
            System.out.print("Skriv djurets namn");
            String name = scanner.next();
            System.out.print("Skriv djurets ålder");
            int age = Integer.parseInt(scanner.next());
            System.out.print("Skriv djurets beteende");
            String behavior = scanner.next();
            animals[i] = new Animal(name, age);
            animals[i].setBehavior(behavior);
        }
        for (Animal animal:animals){
            animal.writeName();
            System.out.println(animal.age);
            animal.behavior();
        }
    }
}
