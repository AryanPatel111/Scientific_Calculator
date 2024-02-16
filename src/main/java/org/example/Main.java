/*
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root function - √x");
            System.out.println("2. Factorial function - x!");
            System.out.println("3. Natural logarithm (base е) - ln(x)");
            System.out.println("4. Power function - x^b");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to find its square root: ");
                    double numberSqrt = scanner.nextDouble();
                    double resultSqrt = calculateSquareRoot(numberSqrt);
                    System.out.println("Square root of " + numberSqrt + " is " + resultSqrt);
                    break;
                case 2:
                    System.out.print("Enter a number to find its factorial: ");
                    int numberFact = scanner.nextInt();
                    int resultFact = calculateFactorial(numberFact);
                    System.out.println("Factorial of " + numberFact + " is " + resultFact);
                    break;
                case 3:
                    System.out.print("Enter a number to find its natural logarithm: ");
                    double numberLog = scanner.nextDouble();
                    double resultLog = calculateNaturalLogarithm(numberLog);
                    System.out.println("Natural logarithm of " + numberLog + " is " + resultLog);
                    break;
                case 4:
                    System.out.print("Enter base (x) value: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (b) value: ");
                    double exponent = scanner.nextDouble();
                    double resultPower = calculatePowerFunction(base, exponent);
                    System.out.println(base + " raised to the power " + exponent + " is " + resultPower);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public static double calculateNaturalLogarithm(double number) {
        return Math.log(number);
    }

    public static double calculatePowerFunction(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
*/

package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("The world's first unscientific calculator. Now with many many DevOp tools behind it");
        Scanner reader = new Scanner(System.in);
        int op, flag = 0;
        double num, exp;
        int numm;

        do {
            System.out.println("------------Calculator--------------");
            System.out.println("Choices of Operations:");
            System.out.println("");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.println("");
            System.out.print("Enter your choice(number): ");
            System.out.println("");
            op = reader.nextInt();
            if (op == 5) flag = 1;
            else {
                switch (op) {
                    case 1:  // Square Root
                        System.out.println("You choose Square Root!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.println("The Result is " + calculateSquareRoot(num));
                        break;

                    case 2: // Factorial
                        System.out.println("You choose Factorial!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        numm = reader.nextInt();
                        System.out.println("The Result is " + calculateFactorial(numm));
                        break;

                    case 3: // Natural Log
                        System.out.println("You choose Natural Log!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.println("The Result is " + calculateNaturalLogarithm(num));
                        break;

                    case 4: // Power
                        System.out.println("You choose Power!!");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.print("exponent: ");
                        exp = reader.nextDouble();
                        System.out.println("The Result is " + calculatePowerFunction(num, exp));
                        break;

                    default:
                        System.out.println("Exiting due to invalid input!!");
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
        int c = num;
        for (int i = num - 1; i >= 1; i--) c = c * i;
        logger.info("Executing Factorial function!");
        return c;
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