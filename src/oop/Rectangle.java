package oop;

public class Rectangle {
    private int hight, widht; // attributen vi behöver

    // Konstruktor
    public Rectangle(int hightInput, int widhtInput) {
        hight = hightInput;
        widht = widhtInput;
    }

    public int calculateArea() {
        return hight * widht;
    }

    public int calculatePerimeter() {
        return (hight + widht) * 2;
    }
}
