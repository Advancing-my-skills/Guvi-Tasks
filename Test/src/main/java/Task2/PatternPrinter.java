package Task2;

import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();

        printPattern(rows);

        scanner.close();
    }

    public static void printPattern(int rows) {
        int midRow = (rows + 1) / 2;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == midRow || j == midRow || (i == 1 && j > midRow) || (i == rows && j < midRow)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
