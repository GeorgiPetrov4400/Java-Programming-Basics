package PBExam.May022019;

import java.util.Scanner;

public class TouristShop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String product = scanner.nextLine();

        int productCount = 0;
        double sumProduct = 0.0;

        while (!product.equals("Stop")) {
            productCount++;
            double priceProduct = Double.parseDouble(scanner.nextLine());
            if (productCount % 3 == 0) {
                priceProduct = priceProduct / 2;
            }
            sumProduct += priceProduct;
            budget -= priceProduct;
            if (budget < 0) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", Math.abs(budget));
                return;
            }
            product = scanner.nextLine();
        }
        System.out.printf("You bought %d products for %.2f leva.", productCount, sumProduct);
    }
}
