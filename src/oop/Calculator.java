package oop;

public class Calculator {
    int x, y;  // classens attribut

    // Konstruktorn som sätter två tal
    Calculator(int inputA, int inputB) {
        x = inputA;
        y = inputB;
    }

    // Metod till objekten av Calculator
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

    public void setNumbers(int numberA, int numberB){
        x= numberA;
        y=numberB;
    }
}
