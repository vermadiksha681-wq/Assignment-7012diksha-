// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
public class ProfitLossCalculator {
    public static void main(String[] args) {
        double costPrice = 129.0;
        double sellingPrice = 191.0;
        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercent = (profit / costPrice) * 100;

            System.out.printf("Profit: ₹%.2f\n", profit);
            System.out.printf("Profit Percentage: %.2f%%\n", profitPercent);
        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercent = (loss / costPrice) * 100;

            System.out.printf("Loss: ₹%.2f\n", loss);
            System.out.printf("Loss Percentage: %.2f%%\n", lossPercent);
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}
