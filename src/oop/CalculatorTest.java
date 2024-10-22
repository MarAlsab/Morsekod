package oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator(3, 4);
        assertEquals(7, calculator.add());
    }

    @Test
    void sub() {
        Calculator calculator = new Calculator(9,3);
        assertEquals(6,calculator.sub());
    }

    @Test
    void mult() {
        Calculator calculator = new Calculator(7,8);
        assertEquals(56,calculator.mult());
    }

    @Test
    void div() {
        Calculator calculator = new Calculator(7,2);
        assertEquals(3.5,calculator.div());
    }

    @Test
    void setNumbers() {
        Calculator calculator = new Calculator(1,1);
        calculator.setNumbers(2,3);
        assertEquals(5,calculator.add());
    }

    @Test
    @DisplayName("4^2=16")
    void power() {
        Calculator calculator = new Calculator(4,2);
        assertEquals(16,calculator.power());
    }

    @Test
    @DisplayName("10^9=1000000000")
    void power2() {
        Calculator calculator = new Calculator(10,9);
        assertEquals(1000_000_000,calculator.power());
    }

    @Test
    @DisplayName("17^0=1")
    void power3() {
        Calculator calculator = new Calculator(17,0);
        assertEquals(1,calculator.power());
    }


}