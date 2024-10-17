package oop;

public class FruitSalad {
    public static void main(String[] args) {
        Fruit apple = new Fruit("green");
        Fruit pear = new Fruit("green");
        // System.out.println(apple.color); because private

        System.out.println("apple color "+apple.getColor());
        apple.setColor("red");
        System.out.println("apple color "+apple.getColor());

        System.out.println("pear color "+pear.getColor());
        pear.setColor("brown");
        System.out.println("pear color "+pear.getColor());

    }
}
