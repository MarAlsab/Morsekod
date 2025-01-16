package automation.oop;

public class Animal {
    public String name;
    public int age;

    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void writeName() {
        System.out.println(name);
    }

    public void behavior() {
        System.out.println("sleep");
    }
}
