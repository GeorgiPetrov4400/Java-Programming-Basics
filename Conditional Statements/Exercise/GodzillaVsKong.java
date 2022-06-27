package ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double peopleClothes = people * clothes;

        if (people > 150) {
            peopleClothes = peopleClothes - peopleClothes * 0.10;
        }
        double decor = budget * 0.10;
        double price = decor + peopleClothes;
        double totalPrice = Math.abs(budget - price);

        if (price <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", totalPrice);
        }
        if (price > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalPrice);
        }

    }
}
