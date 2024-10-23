package oop;

public class Calculator {
    private int x, y;  // classens attribut / Klassvariabler

    // Konstruktorn som sätter två tal har inparametrar/ argument
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

    // Metod som svarar med double
    public double div() {
        return (double) x / y;
    }

    // Metod void svarar inte med något- Denna Metod har 2 inparametrar s.k. Argument i form av int
    public void setNumbers(int numberA, int numberB) {
        x = numberA;
        y = numberB;
    }

    public int power() {
//        int result = 1;
//        for (int i = 0; i < y; i++) result = result * x;
//        return result;
        return (int) Math.pow(x,y);
    }
}
