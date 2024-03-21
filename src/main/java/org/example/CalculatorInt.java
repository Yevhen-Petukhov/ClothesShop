package org.example;

public class CalculatorInt implements Calculator<Integer>{
    @Override
    public Integer sum(Integer a, Integer b) {
        System.out.println("Sum: ");
        return a + b;
    }
    @Override
    public Integer difference(Integer a, Integer b) {
        System.out.println("Difference: ");
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        System.out.println("Multiply: ");
        return a * b;
    }

    @Override
    public Integer divide(Integer a, Integer b) {
        System.out.println("Divide: ");
        return a / b;
    }

    @Override
    public Integer square(Integer a) {
        System.out.println("Square: ");
        return a * a;
    }

}
