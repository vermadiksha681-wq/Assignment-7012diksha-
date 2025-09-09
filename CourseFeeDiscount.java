// The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.

public class CourseFeeDiscount {
    public static void main(String[] args) {
        double originalFee = 125000.0;
        double discountRate = 10.0; 
        double discountAmount = (discountRate / 100) * originalFee;
        double discountedPrice = originalFee - discountAmount;
        System.out.printf("Original Course Fee: ₹%.2f\n", originalFee);
        System.out.printf("Discount Amount (10%%): ₹%.2f\n", discountAmount);
        System.out.printf("Discounted Course Fee: ₹%.2f\n", discountedPrice);
    }
}
