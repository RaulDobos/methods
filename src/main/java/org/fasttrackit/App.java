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
        int a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert an integer value for a: ");
        a = scanner.nextInt();

        System.out.println("Insert an integer value for b: ");
        b = scanner.nextInt();

        Operations operations = new Operations();

        System.out.println("a + b = " + operations.add(a, b));
        System.out.println("a - b = "+ operations.subtract(a, b));
        System.out.println("a * b = " + operations.multiply(a, b));
        System.out.println("a / b = " + operations.divide(a, b) + "\n");

        System.out.println("Insert an integer/floating point value for c:");

        double c = scanner.nextDouble();

        System.out.println("Insert an integer/floating point value for b:");

        double d = scanner.nextDouble();

        System.out.println("c + d = " + operations.add(c, d));
        System.out.println("c - d = "+ operations.subtract(c, d));
        System.out.println("c * d = " + operations.multiply(c, d));
        System.out.println("c / d = " + operations.divide(c, d));
    }
}
