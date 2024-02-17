package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("SPE SCIENTIFIC JAVA CALCULATOR");
        Scanner reader = new Scanner(System.in);
        int op, flag = 0;
        double num, exp;
        int numm;

        do {
            System.out.println("Calculator.......");
            System.out.println("Choose Operation to perform:");
            System.out.println("");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.println("");
            System.out.print("Enter your choice: ");
            System.out.println("");
            op = reader.nextInt();
            if (op == 5) flag = 1;
            else {
                switch (op) {
                    case 1:  // Square Root
                        System.out.println("Square Root Operation!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.println("The Result is " + calculateSquareRoot(num));
                        break;

                    case 2: // Factorial
                        System.out.println("Factorial Operation!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        numm = reader.nextInt();
                        System.out.println("The Result is " + calculateFactorial(numm));
                        break;

                    case 3: // Natural Log
                        System.out.println("Natural Log Operation!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.println("The Result is " + calculateNaturalLogarithm(num));
                        break;

                    case 4: // Power
                        System.out.println("Power Operation!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.print("exponent: ");
                        exp = reader.nextDouble();
                        System.out.println("The Result is " + calculatePowerFunction(num, exp));
                        break;

                    default:
                        System.out.println("Invalid input!!!  Exiting...");
                        flag = 1;
                }
            }
        } while (flag == 0);
    }

    public static double calculateSquareRoot(double num) {
        double c = Math.sqrt(num);
        logger.info("Executing squareRoot function!");
        return c;
    }

    public static int calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }

        logger.info("Executing Factorial function!");
        return factorial;
    }

    public static double calculateNaturalLogarithm(double num) {
        double c = Math.log(num);
        logger.info("Executing naturalLog function!");
        return c;
    }

    public static double calculatePowerFunction(double num, double exp) {
        double c = Math.pow(num, exp);
        logger.info("Executing Power function!");
        return c;
    }
}