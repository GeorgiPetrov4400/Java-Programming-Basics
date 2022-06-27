package PBExam.April202019;

import java.util.Scanner;

public class EasterDecoration06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        //кошничка за яйца (basket) – 1.50 лв.
        //великденски венец (wreath) – 3.80 лв.
        //шоколадов заек (chocolate bunny) – 7 лв.
        double allSum = 0.0;

        for (int i = 1; i <= clients; i++) {
            String purchase = scanner.nextLine();
            double priceBasket = 0.0;
            double priceWreath = 0.0;
            double priceChocolateBunny = 0.0;

            int count = 0;

            while (!purchase.equals("Finish")) {
                switch (purchase) {
                    case "basket":
                        priceBasket += 1.50;
                        count++;
                        break;
                    case "wreath":
                        priceWreath += 3.80;
                        count++;
                        break;
                    case "chocolate bunny":
                        priceChocolateBunny += 7;
                        count++;
                        break;
                }

                purchase = scanner.nextLine();
            }
            double totalPrice = priceBasket + priceWreath + priceChocolateBunny;
            if (count % 2 == 0) {
                totalPrice = totalPrice * 0.80;
            }
            allSum += totalPrice;
            System.out.printf("You purchased %d items for %.2f leva.%n", count, totalPrice);

        }
        System.out.printf("Average bill per client is: %.2f leva.", allSum / clients);

    }
}
