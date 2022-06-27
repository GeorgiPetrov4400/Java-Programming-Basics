package PBExam.May022019;

import java.util.Scanner;

public class FruitMarket01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananaKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice * 0.50;
        double orangePrice = raspberryPrice * 0.60;
        double bananaPrice = raspberryPrice * 0.20;
        double totalSum = strawberryPrice * strawberryKg + bananaPrice * bananaKg + orangePrice * orangeKg
                + raspberryPrice * raspberryKg;
        System.out.printf("%.2f", totalSum);
    }
}
