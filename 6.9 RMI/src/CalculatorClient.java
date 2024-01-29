import java.rmi.Naming;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            // Look up the remote object from the registry
            Calculator calculator = (Calculator) Naming.lookup(
                    "rmi://localhost:1099/CalculatorService"
            );

            // Perform calculations
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            int sum = calculator.add(a, b);
            System.out.println("Sum: " + sum);

            int difference = calculator.subtract(a, b);
            System.out.println("Difference: " + difference);

            int product = calculator.multiply(a, b);
            System.out.println("Product: " + product);

            int quotient = calculator.divide(a, b);
            System.out.println("Quotient: " + quotient);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}