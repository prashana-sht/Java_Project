package pkg2.pkg2.calculator;
import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("Sum: " + sum);

            double difference = num1 - num2;
            System.out.println("Difference: " + difference);

            double product = num1 * num2;
            System.out.println("Product: " + product);

            if (num2 != 0) {
                double quotient = num1 / num2;
                System.out.println("Quotient: " + quotient);
            } else {
                System.out.println("Cannot divide by zero.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}
