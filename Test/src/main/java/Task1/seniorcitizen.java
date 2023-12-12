package Task1;

import java.util.Scanner;

public class seniorcitizen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age to check senior citizenship: ");
        int age = scanner.nextInt();

        if (age >= 60) {
            System.out.println("The person is a senior citizen.");
        } else {
            System.out.println("The person is not a senior citizen.");
        }

        scanner.close();
    }
}

