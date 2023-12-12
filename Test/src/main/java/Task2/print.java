package Task2;

import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();

        printPattern(rows);

        scanner.close();
    }

    public static void printPattern(int rows) {
        int counter = 1;
        for (int i = 1; i <= rows; i++) {
            int spaces = 2 * (rows - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}

