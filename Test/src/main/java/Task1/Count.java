package Task1;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = String.valueOf(Math.abs(number)).length();

        System.out.println("Number of digits in the integer: " + count);

        scanner.close();
    }
}