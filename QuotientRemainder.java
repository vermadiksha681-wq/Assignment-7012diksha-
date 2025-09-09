// Write a program to take 2 numbers and print their quotient and reminder
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend (integer): ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor (integer): ");
        int divisor = scanner.nextInt();
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.printf("Quotient: %d\n", quotient);
            System.out.printf("Remainder: %d\n", remainder);
        }
        scanner.close();
    }
}

