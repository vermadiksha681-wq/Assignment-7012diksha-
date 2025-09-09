// Write a program the find the distance in yards and miles for the distance provided by user in feets
import java.util.Scanner;
public class FeetToDistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
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

