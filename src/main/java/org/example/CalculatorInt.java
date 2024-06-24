package org.example;

public class CalculatorInt implements Calculator<Integer>{
    @Override
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }
    @Override
    public Integer difference(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer divide(Integer a, Integer b) {
        return a / b;

    }

    @Override
    public Integer square(Integer a) {
        return a * a;
    }

}
