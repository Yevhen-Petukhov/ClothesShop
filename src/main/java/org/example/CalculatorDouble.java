package org.example;

public class CalculatorDouble implements Calculator<Double> {
    @Override
    public Double sum(Double a, Double b) {
        System.out.println("Sum: ");
        return a + b;
    }
    @Override
    public Double difference(Double a, Double b) {
        System.out.println("Difference: ");
        return a - b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        System.out.println("Multiply: ");
        return a * b;
    }

    @Override
    public Double divide(Double a, Double b) {
        System.out.println("Divide: ");
        return a / b;
    }

    @Override
    public Double square(Double a) {
        System.out.println("Square: ");
        return a * a;
    }

}
