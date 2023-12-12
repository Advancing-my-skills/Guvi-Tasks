package Task2;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks scored by the student: ");
        int marks = scanner.nextInt();

        if (marks > 100) {
            System.out.println("Invalid Input");
        } else {
            String grade = calculateGrade(marks);
            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }

    public static String calculateGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return "A";
        } else if (marks >= 80 && marks <= 89) {
            return "B";
        } else if (marks >= 70 && marks <= 79) {
            return "C";
        } else if (marks >= 60 && marks <= 69) {
            return "D";
        } else if (marks >= 50 && marks <= 59) {
            return "E";
        } else {
            return "F";
        }
    }
}