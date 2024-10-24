package oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CircleTest {
    //TDD vi skapar testet först
    @Test
    @DisplayName("Test av cirkelns area när radien är 10")
    void testOfCircleAreaRadius10() {
        // skapar lokalt objekt circle
        //Klassen  //lokalt objekt  //anrop av kontstruktor
        Circle circle = new Circle(10);
        System.out.println(circle.getRadie());
        // Verifiering av att arean av en
        // cirkel med radie 10 = 314
        assertEquals(314, circle.calculateArea());
    }

    @Test
    @DisplayName("Test av cirkelns area när radien är 5")
    void testOfCircleAreaRadius5() {
        Circle circle = new Circle(5);
        assertEquals(78.5, circle.calculateArea());
    }

    @Test
    @DisplayName("Test av cirkelns area när radien är 7,5")
    void testOfCircleAreaRadius7dot5() {
        Circle circle = new Circle(7.5);
        assertEquals(176.625, circle.calculateArea());
    }

    @Test
    void testOfBiggerThan(){
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(5);
        assertEquals(true,circle1.isBiggerThan(circle2));
    }

}
