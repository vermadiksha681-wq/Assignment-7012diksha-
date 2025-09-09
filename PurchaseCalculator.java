// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
import java.util.Scanner;
public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.printf("Total price for %d items is: ₹%.2f\n", quantity, totalPrice);
        scanner.close();
    }
}

