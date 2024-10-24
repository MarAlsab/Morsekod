package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Circle {
    private double radie;   // klassvariabel, Attribut

    // Konstruktor med argument in även kallat inparameter
    public Circle(double r) {
        radie = r;
    }

    public double calculateArea() {
        return  radie * radie * 3.14;
    }

    // Behövs om radien är private för att vis aden i andra program
    public double getRadie(){
        return radie;
    }

    public boolean isBiggerThan(Circle circle) {
        // Använder this för att peka på den anropande circle1 medan circle = circle2 från anropet
        return (this.calculateArea() > circle.calculateArea());
    }
}
