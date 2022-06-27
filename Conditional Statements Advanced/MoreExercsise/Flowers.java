package ConditionalStatementsAdvanced.MoreExcercise;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        switch (season) {
            case "Spring":
            case "Summer":
                double priceChrysanthemums = chrysanthemums * 2.00;
                double priceRoses = roses * 4.10;
                double priceTulips = tulips * 2.50;
                double totalPrice = priceChrysanthemums + priceRoses + priceTulips;
                switch (holiday) {
                    case "Y":
                        totalPrice = totalPrice * 1.15;
                        if (season.equals("Spring") && tulips > 7) {
                            totalPrice = totalPrice * 0.95;
                        }
                        if ((chrysanthemums + roses + tulips) > 20) {
                            totalPrice = totalPrice * 0.80;
                            System.out.printf("%.2f", totalPrice + 2);
                        } else {
                            System.out.printf("%.2f", totalPrice + 2);
                        }
                        break;
                    case "N":
                        if (season.equals("Spring") && tulips > 7) {
                            totalPrice = totalPrice * 0.95;
                        }
                        if ((chrysanthemums + roses + tulips) > 20) {
                            totalPrice = totalPrice * 0.80;
                            System.out.printf("%.2f", totalPrice + 2);
                        } else {
                            System.out.printf("%.2f", totalPrice + 2);
                        }

                        break;
                }
                break;
            case "Autumn":
            case "Winter":
                double priceChrysanthemums2 = chrysanthemums * 3.75;
                double priceRoses2 = roses * 4.50;
                double priceTulips2 = tulips * 4.15;
                double totalPrice2 = priceChrysanthemums2 + priceRoses2 + priceTulips2;
                switch (holiday) {
                    case "Y":
                        totalPrice2 = totalPrice2 * 1.15;
                        if (season.equals("Winter") && roses >= 10) {
                            totalPrice2 = totalPrice2 * 0.90;
                        }
                        if ((chrysanthemums + roses + tulips) > 20) {
                            totalPrice2 = totalPrice2 * 0.80;
                            System.out.printf("%.2f", totalPrice2 + 2);
                        } else {
                            System.out.printf("%.2f", totalPrice2 + 2);
                        }
                        break;
                    case "N":
                        if (season.equals("Winter") && roses >= 10) {
                            totalPrice2 = totalPrice2 * 0.90;
                        }
                        if ((chrysanthemums + roses + tulips) > 20) {
                            totalPrice2 = totalPrice2 * 0.80;
                            System.out.printf("%.2f", totalPrice2 + 2);
                        } else {
                            System.out.printf("%.2f", totalPrice2 + 2);
                        }
                        break;
                }
                break;
        }
    }
}
