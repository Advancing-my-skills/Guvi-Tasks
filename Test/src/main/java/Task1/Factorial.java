package Task1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
