// Similarly, write the DoubleOpt program by taking double values and doing the same operations.
import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter double a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter double b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter double c: ");
        double c = scanner.nextDouble();
        double result1 = a + b * c;   
        double result2 = a * b + c;   
        double result3 = c + a / b;   
        double result4 = a % b + c;  
        System.out.printf("a + b * c = %.4f\n", result1);
        System.out.printf("a * b + c = %.4f\n", result2);
        System.out.printf("c + a / b = %.4f\n", result3);
        System.out.printf("a %% b + c = %.4f\n", result4);  
        scanner.close();
    }
}

