// Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
public class AveragePercentage {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int totalMarks = maths + physics + chemistry;
        int numberOfSubjects = 3;
        double average = (double) totalMarks / numberOfSubjects;
        System.out.println("Sam's average percentage in PCM is: " + average + "%");
    }
}

