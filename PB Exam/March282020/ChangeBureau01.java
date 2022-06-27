package PBExam.March282020;

import java.util.Scanner;

public class ChangeBureau01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        int priceBitcoinLeva = bitcoin * 1168;
        double priceYuanLeva = yuan * 0.15 * 1.76;
        double totalPriceLeva = priceBitcoinLeva + priceYuanLeva;
        double priceEuro = totalPriceLeva / 1.95;
        double discountPriceEuro = priceEuro - priceEuro * (commission / 100);

        System.out.printf("%.2f", discountPriceEuro);
    }
}
