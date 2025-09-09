// Write a program to find the side of the square whose parameter you read from user
import java.util.Scanner;
public class SquareSideFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        double side = perimeter / 4;
        System.out.printf("The side length of the square is: %.2f\n", side);

        scanner.close();
    }
}

