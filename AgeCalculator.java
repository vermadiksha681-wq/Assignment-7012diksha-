// Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
public class AgeCalculator {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age is: " + age + " years old.");
    }
}
