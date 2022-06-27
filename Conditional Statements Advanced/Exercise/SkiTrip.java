package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String accommodation = scanner.nextLine();
        String rating = scanner.nextLine();

        double priceRoom = (days - 1) * 18.00;
        double priceApartment = (days - 1) * 25.00;
        double pricePresidentApartment = (days - 1) * 35.00;

        if (accommodation.equals("room for one person")) {
            if (rating.equals("positive")) {
                System.out.printf("%.2f", priceRoom * 1.25);
            } else if (rating.equals("negative")) {
                System.out.printf("%.2f", priceRoom * 0.90);
            }
        } else if (accommodation.equals("apartment")) {
            if (days < 10) {
                priceApartment = priceApartment - priceApartment * 0.30;
            } else if (days >= 10 && days <= 15) {
                priceApartment = priceApartment - priceApartment * 0.35;
            } else if (days > 15) {
                priceApartment = priceApartment - priceApartment * 0.50;
            }
            if (rating.equals("positive")) {
                System.out.printf("%.2f", priceApartment * 1.25);
            } else if (rating.equals("negative")) {
                System.out.printf("%.2f", priceApartment * 0.90);
            }
        } else if (accommodation.equals("president apartment")) {
            if (days < 10) {
                pricePresidentApartment = pricePresidentApartment - pricePresidentApartment * 0.10;
            } else if (days >= 10 && days <= 15) {
                pricePresidentApartment = pricePresidentApartment - pricePresidentApartment * 0.15;
            } else if (days > 15) {
                pricePresidentApartment = pricePresidentApartment - pricePresidentApartment * 0.20;
            }
            if (rating.equals("positive")) {
                System.out.printf("%.2f", pricePresidentApartment * 1.25);
            } else if (rating.equals("negative")) {
                System.out.printf("%.2f", pricePresidentApartment * 0.90);
            }
        }
    }

}

