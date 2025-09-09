// Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
import java.util.Scanner;
public class UniversityFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original course fee (INR): ");
        double originalFee = scanner.nextDouble();
        System.out.print("Enter the discount percentage offered by the university: ");
        double discountRate = scanner.nextDouble();
        double discountAmount = (discountRate / 100) * originalFee;
        double discountedPrice = originalFee - discountAmount;
        System.out.printf("\nOriginal Course Fee: ₹%.2f\n", originalFee);
        System.out.printf("Discount Amount (%.2f%%): ₹%.2f\n", discountRate, discountAmount);
        System.out.printf("Discounted Course Fee: ₹%.2f\n", discountedPrice);

        scanner.close();
    }
}

