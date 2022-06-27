package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int night = Integer.parseInt(scanner.nextLine());

        double studio = 0.0;
        double apartment = 0.0;


        if (month.equals("May") || month.equals("October")) {
            studio = 50;
            apartment = 65;
            double priceStudio = studio * night;
            double priceApartment = apartment * night;
            if (night > 7 && night <= 14) {
                priceStudio = priceStudio - priceStudio * 0.05;
            }
            if (night > 14) {
                priceStudio = priceStudio - priceStudio * 0.30;
                priceApartment = priceApartment - priceApartment * 0.10;
                System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                System.out.printf("Studio: %.2f lv.", priceStudio);
            } else {
                System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                System.out.printf("Studio: %.2f lv.", priceStudio);
            }
        } else if (month.equals("June") || month.equals("September")) {
            studio = 75.20;
            apartment = 68.70;
            double priceStudio = studio * night;
            double priceApartment = apartment * night;
            if (night > 14) {
                priceStudio = priceStudio - priceStudio * 0.20;
                priceApartment = priceApartment - priceApartment * 0.10;
                System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                System.out.printf("Studio: %.2f lv.", priceStudio);
            } else {
                System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                System.out.printf("Studio: %.2f lv.", priceStudio);
            }
        } else if (month.equals("July") || month.equals("August")) {
            studio = 76;
            apartment = 77;
            double priceStudio = studio * night;
            double priceApartment = apartment * night;
            if (night > 14) {
                priceApartment = priceApartment - priceApartment * 0.10;
                System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                System.out.printf("Studio: %.2f lv.", priceStudio);
            } else {
                System.out.printf("Apartment: %.2f lv.%n", priceApartment);
                System.out.printf("Studio: %.2f lv.", priceStudio);
            }
        }
    }
}
