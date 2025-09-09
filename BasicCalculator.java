// Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.printf("Division: %.2f / %.2f = %.2f\n", num1, num2, division);
        } else {
            System.out.println("Division: Cannot divide by zero!");
        }
        System.out.printf("Addition: %.2f + %.2f = %.2f\n", num1, num2, addition);
        System.out.printf("Subtraction: %.2f - %.2f = %.2f\n", num1, num2, subtraction);
        System.out.printf("Multiplication: %.2f * %.2f = %.2f\n", num1, num2, multiplication);
        scanner.close();
    }
}

