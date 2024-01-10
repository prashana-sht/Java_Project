package pkg1.pkg5.exceptionhandeling;
import java.util.Scanner;
public class ExceptionHandeling {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new Exception("Number must be positive.");
            }

            System.out.println("Square of the number: " + squareNumber(number));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Scanner closed in the finally block.");
        }
    }

    private static int squareNumber(int num) {
        return num * num;
    }
}
