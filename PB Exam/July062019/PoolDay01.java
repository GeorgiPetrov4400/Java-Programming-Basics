package PBExam.July062019;

import java.util.Scanner;

public class PoolDay01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entryTax = Double.parseDouble(scanner.nextLine());
        double priceDeckchair = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double totalEntryTax = people * entryTax;
        double totalPriceDeckchair = Math.ceil(people * 0.75) * priceDeckchair;
        double totalPriceUmbrella = Math.ceil(people * 0.50) * priceUmbrella;
        double totalPrice = totalEntryTax + totalPriceDeckchair + totalPriceUmbrella;
        System.out.printf("%.2f lv.", totalPrice);
    }
}
