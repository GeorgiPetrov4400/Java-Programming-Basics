package PBExam.October2021;

import java.util.Scanner;

public class FootbalKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceShirt = Double.parseDouble(scanner.nextLine());
        double neededSum = Double.parseDouble(scanner.nextLine());

        double priceShorts = priceShirt * 0.75;
        double priceSocks = priceShorts * 0.20;
        double buttons = (priceShirt + priceShorts) * 2;
        double allSum = priceShirt + priceShorts + priceSocks + buttons;
        double discountSum = allSum * 0.85;

        if (discountSum >= neededSum) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", discountSum);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", neededSum - discountSum);
        }
    }
}
