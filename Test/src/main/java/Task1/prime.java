package Task1;
import java.util.Scanner;
public class prime {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        boolean isPrime = number > 1;

	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));

	        scanner.close();
	    }
	}
