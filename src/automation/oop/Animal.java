package automation.oop;

public class Animal {
    public String name;
    public int age;
    public String behavior;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.behavior = "sleep";
    }

    public void writeName() {
        System.out.println(name);
    }

    public void behavior() {
        System.out.println(behavior);
    }

    public void setBehavior(String behaviour) {
        this.behavior = behaviour;
    }
}
