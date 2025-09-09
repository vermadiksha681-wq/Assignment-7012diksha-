// Write a program to find the distance in yards and miles for the distance provided by the user in feet
import java.util.Scanner;

public class FeetConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double feet = scanner.nextDouble();
        double feetPerYard = 3.0;
        double feetPerMile = 5280.0;
        double yards = feet / feetPerYard;
        double miles = feet / feetPerMile;
        System.out.printf("%.2f feet is equal to %.2f yards.\n", feet, yards);
        System.out.printf("%.2f feet is equal to %.5f miles.\n", feet, miles);
        scanner.close();
    }
}

