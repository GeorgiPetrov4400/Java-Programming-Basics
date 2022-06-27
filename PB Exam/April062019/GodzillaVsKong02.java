package PBExam.April062019;

import java.util.Scanner;

public class GodzillaVsKong02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothesPerPeople = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double priceClothes = people * clothesPerPeople;
        if (people > 150) {
            priceClothes = priceClothes - priceClothes * 0.10;
        }
        double priceMovie = decor + priceClothes;
        if (priceMovie <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - priceMovie);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", priceMovie - budget);
        }
    }
}
