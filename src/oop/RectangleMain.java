package oop;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv höjd: ");
        int hight = scanner.nextInt();
        System.out.print("Skriv bredd: ");
        int widht = scanner.nextInt();
        Rectangle rectangle = new Rectangle(hight, widht);
        System.out.println("Arean är : "+rectangle.calculateArea());
        System.out.println("Omkretsen är: "+rectangle.calculatePerimeter());
    }
}
