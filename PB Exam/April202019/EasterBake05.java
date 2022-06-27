package PBExam.April202019;

import java.util.Scanner;

public class EasterBake05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());

        int sugar = Integer.parseInt(scanner.nextLine());
        int flour = Integer.parseInt(scanner.nextLine());
        int allSugar = 0;
        int allFlour = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= easterBread; i++) {
            allSugar += sugar;
            allFlour += flour;
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            if (flour > maxFlour) {
                maxFlour = flour;
            }
            if (i == easterBread) {
                double sugarPackages = Math.ceil(allSugar * 1.0 / 950);
                double flourPackages = Math.ceil(allFlour * 1.0 / 750);
                System.out.printf("Sugar: %.0f%n", sugarPackages);
                System.out.printf("Flour: %.0f%n", flourPackages);
                break;
            }
            sugar = Integer.parseInt(scanner.nextLine());
            flour = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
