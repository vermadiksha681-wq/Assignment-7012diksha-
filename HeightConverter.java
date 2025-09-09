// Write a program that takes your height in centimeters and converts it into feet and inches
import java.util.Scanner;
public class HeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;
        double totalInches = heightCm / cmPerInch;
        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;
        System.out.printf("Your height is %d feet and %.2f inches.\n", feet, inches);
        scanner.close();
    }
}
