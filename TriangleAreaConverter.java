// Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
import java.util.Scanner;
public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (cm): ");
        double baseCm = scanner.nextDouble();
        System.out.print("Enter the height of the triangle (cm): ");
        double heightCm = scanner.nextDouble();
        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaIn2 = areaCm2 / 6.4516;
        System.out.printf("Area of the triangle: %.2f cm²\n", areaCm2);
        System.out.printf("Area of the triangle: %.2f in²\n", areaIn2);
        scanner.close();
    }
}

