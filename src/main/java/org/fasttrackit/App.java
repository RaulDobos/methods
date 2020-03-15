package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double a, b, res;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a value for a: ");
        a = scanner.nextDouble();

        System.out.println("Insert a value for b: ");
        b = scanner.nextDouble();

        Operations operations = new Operations();

        res = operations.add(a, b);
        System.out.println("a + b result is: " + res);

        res = operations.subtract(a, b);
        System.out.println("a - b result is: " + res);

        res = operations.subtract(b, a);
        System.out.println("b - a result is: " + res);

        res = operations.multiply(a, b);
        System.out.println("a * b result is: " + res);

        res = operations.divide(a, b);
        System.out.println("a / b result is: " + res);

        res = operations.divide(b, a);
        System.out.println("b / a result is: " + res);

    }
}
