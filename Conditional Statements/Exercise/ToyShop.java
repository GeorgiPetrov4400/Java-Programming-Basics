package ConditionalStatements.Exercises;

import java.io.PrintStream;
import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int puzzels = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double puzzelsPrice = puzzels * 2.60;
        double dollsPrice = dolls * 3;
        double bearsPrice = bears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2;

        int toys = puzzels + dolls + bears + minions + trucks;
        double totalPrice = puzzelsPrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;
        if (toys >= 50) {
            totalPrice = totalPrice * 0.75;
        }
        double rent = totalPrice * 0.1;
        double profit = totalPrice - rent;
        double excursionProfit = Math.abs(profit - priceExcursion);


        if (profit >= priceExcursion) {
            System.out.printf("Yes! %.2f lv left.", excursionProfit);
        } else {
            PrintStream printf = System.out.printf("Not enough money! %.2f lv needed.", excursionProfit);
        }

    }
}
