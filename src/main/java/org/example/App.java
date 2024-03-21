package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
float a = 10;
float b = 2;
Calculator<Float> calculator = new;
        System.out.println("Add:" + calculator.sum(a,b));
        System.out.println("Minus:" + calculator.difference(a,b));
        System.out.println("Multiply:" + calculator.multiply(a,b));
        System.out.println("Divide:" + calculator.divide(a,b));

    }
}
