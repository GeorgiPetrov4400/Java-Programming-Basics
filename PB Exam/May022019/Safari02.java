package PBExam.May022019;

import java.util.Scanner;

public class Safari02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuelLitres = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double priceExcursion = fuelLitres * 2.10 + 100;

        switch (day) {
            case "Saturday":
                priceExcursion = priceExcursion * 0.90;
                break;
            case "Sunday":
                priceExcursion = priceExcursion * 0.80;
                break;
        }
        if (budget >= priceExcursion) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - priceExcursion);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", priceExcursion - budget);
        }
    }
}
