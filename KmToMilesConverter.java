// Create a program to convert the distance of 10.8 kilometers to miles.
public class KmToMilesConverter {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double milesPerKm = 0.621371; 
        double miles = kilometers * milesPerKm;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}
