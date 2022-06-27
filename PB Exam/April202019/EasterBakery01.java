package PBExam.April202019;

import java.util.Scanner;

public class EasterBakery01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFlour = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggPackage = Integer.parseInt(scanner.nextLine());
        int yeast = Integer.parseInt(scanner.nextLine());

        double priceSugar = priceFlour * 0.75;
        double priceEgg = priceFlour * 1.1;
        double priceYeast = priceSugar * 0.2;

        double totalPrice = priceFlour * flourKg + priceSugar * sugarKg + priceEgg * eggPackage + priceYeast * yeast;

        System.out.printf("%.2f", totalPrice);
    }
}