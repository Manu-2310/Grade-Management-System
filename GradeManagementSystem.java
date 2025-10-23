import java.util.Scanner;

public class GradeManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("        🎓 Grade Management System       ");
        System.out.println("=========================================");

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();

        String[] studentNames = new String[numStudents];
        double[][] marks = new double[numStudents][numSubjects];
        double[] average = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n-----------------------------------------");
            System.out.println("Enter details for Student " + (i + 1));
            System.out.println("-----------------------------------------");
            System.out.print("Name: ");
            studentNames[i] = sc.next();

            double total = 0;
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextDouble();
                total += marks[i][j];
            }

            average[i] = total / numSubjects;

            if (average[i] >= 90)
                grades[i] = 'A';
            else if (average[i] >= 80)
                grades[i] = 'B';
            else if (average[i] >= 70)
                grades[i] = 'C';
            else if (average[i] >= 60)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }

        // Display Report
        System.out.println("\n\n=========================================");
        System.out.println("           📋 Student Grade Report        ");
        System.out.println("=========================================");
        System.out.printf("%-15s %-15s %-15s%n", "Student Name", "Average Marks", "Grade");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-15s %-15.2f %-15c%n", studentNames[i], average[i], grades[i]);
        }

        System.out.println("=========================================");
        System.out.println("         ✅ Report Generated Successfully ");
        System.out.println("=========================================");

        sc.close();
    }
}
