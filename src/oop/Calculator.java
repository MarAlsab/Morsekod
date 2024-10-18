package oop;

public class Calculator {
    int x, y;  // classens attribut

    // Konstruktorn som sätter två tal
    Calculator(int inputA, int inputB) {
        x = inputA;
        y = inputB;
    }

    public int add() {
        return x + y;
    }

    public int sub() {
        return x - y;
    }

    public int mult() {
        return x * y;
    }

    public double div() {
        return (double) x/y;
    }
}
