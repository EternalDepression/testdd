package org.example;

public class Main {
    public static void main(String[] args) {

        Calc calculator = new Calc();
        calculator.summ(1, 10);
    }

    static {
        Calc calculator = new Calc();
        calculator.min(6, 3);
    }
}