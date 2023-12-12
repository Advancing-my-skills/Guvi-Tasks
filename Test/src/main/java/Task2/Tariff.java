package Task2;

import java.util.Scanner;

public class Tariff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the room rent per day: ");
        double roomRent = scanner.nextDouble();

        System.out.print("Enter the number of days stayed in the hotel: ");
        int daysStayed = scanner.nextInt();

        double hotelTariff = calculateHotelTariff(month, roomRent, daysStayed);
        System.out.printf("Hotel tariff to be paid: %.2f\n", hotelTariff);

        scanner.close();
    }

    public static double calculateHotelTariff(int month, double roomRent, int daysStayed) {
        double tariff;

        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                roomRent *= 1.2; // Increase room rent by 20% during peak seasons
                break;
            default:
                break;
        }

        tariff = roomRent * daysStayed;
        return tariff;
    }
}
