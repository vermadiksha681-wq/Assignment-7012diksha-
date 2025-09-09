// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;
        int pensPerStudent = totalPens / totalStudents;         
        int remainingPens = totalPens % totalStudents;          
        System.out.println("Each student will get " + pensPerStudent + " pens.");
        System.out.println("Remaining non-distributed pens: " + remainingPens);
    }
}

