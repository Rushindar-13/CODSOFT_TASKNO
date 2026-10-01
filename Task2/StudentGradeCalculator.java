import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       STUDENT GRADE CALCULATOR");
        System.out.println("========================================");

        // Get the number of subjects
        int subjects;

        while (true) {
            System.out.print("Enter number of subjects: ");
            subjects = scanner.nextInt();

            if (subjects > 0) {
                break;
            }

            System.out.println(
                "Invalid number of subjects! Please enter at least 1 subject."
            );
        }

        // Calculate total marks
        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {

            int marks;

            while (true) {
                System.out.print(
                    "Enter marks for Subject " + i + " (0-100): "
                );

                marks = scanner.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                }

                System.out.println(
                    "Invalid marks! Please enter a value between 0 and 100."
                );
            }

            totalMarks += marks;
        }

        // Calculate average percentage
        double averagePercentage =
                (double) totalMarks / subjects;

        // Calculate grade
        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\n========================================");
        System.out.println("              RESULTS");
        System.out.println("========================================");

        System.out.println(
            "Total Marks        : "
            + totalMarks
            + " / "
            + (subjects * 100)
        );

        System.out.printf(
            "Average Percentage : %.2f%%\n",
            averagePercentage
        );

        System.out.println("Grade              : " + grade);

        System.out.println("========================================");

        scanner.close();
    }
}