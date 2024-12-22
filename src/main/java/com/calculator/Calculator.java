package com.calculator;


public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }


    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nuk mund te behet pjesetim me 0.");
        }
        return (double) a / b;
    }
}
