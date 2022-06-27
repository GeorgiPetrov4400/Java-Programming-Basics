package PBExam.April202019;

import java.util.Scanner;

public class EasterTrip03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String date = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceExcursion = 0.0;

        switch (country) {
            case "France":
                switch (date) {
                    case "21-23":
                        priceExcursion = nights * 30;
                        System.out.printf("Easter trip to %s : %.2f leva.", country, priceExcursion);
                        break;
                    case "24-27":
                        priceExcursion = nights * 35;
                        System.out.printf("Easter trip to %s : %.2f leva.", country, priceExcursion);
                        break;
                    case "28-31":
                        priceExcursion = nights * 40;
                        System.out.printf("Easter trip to %s : %.2f leva.", country, priceExcursion);
                        break;
                }
                break;
            case "Italy":
                switch (date) {
                    case "21-23":
                        priceExcursion = nights * 28;
                        System.out.printf("Easter trip to %s : %.2f leva.", country, priceExcursion);
                        break;
                    case "24-27":
                        priceExcursion = nights * 32;
                        System.out.printf("Easter trip to %s : %.2f leva.", country, priceExcursion);
                        break;
                    case "28-31":
                        priceExcursion = nights * 39;
                        System.out.printf("Easter trip to %s : %.2f leva.", country, priceExcursion);
                        break;
                }
                break;
            case "Germany":
                switch (date) {
                    case "21-23":
                        priceExcursion = nights * 32;
                        System.out.printf("Easter trip to %s : %.2f leva.", country, priceExcursion);
                        break;
                    case "24-27":
                        priceExcursion = nights * 37;
                        System.out.printf("Easter trip to %s : %.2f leva.", country, priceExcursion);
                        break;
                    case "28-31":
                        priceExcursion = nights * 43;
                        System.out.printf("Easter trip to %s : %.2f leva.", country, priceExcursion);
                        break;
                }
                break;
        }

    }
}
