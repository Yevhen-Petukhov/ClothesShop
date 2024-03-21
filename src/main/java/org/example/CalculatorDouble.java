package org.example;

public class CalculatorDouble implements Calculator<Double> {
    @Override
    public Double sum(Double a, Double b) {
        return a + b;
    }
    @Override
    public Double difference(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double divide(Double a, Double b) {
        return a / b;
    }

    @Override
    public Double square(Double a) {
        return a * a;
    }

}
