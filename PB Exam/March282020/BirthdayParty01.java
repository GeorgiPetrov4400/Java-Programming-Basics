package PBExam.March282020;

import java.util.Scanner;

public class BirthdayParty01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hallRent = Double.parseDouble(scanner.nextLine());

        double priceCake = hallRent * 0.20;
        double priceDrinks = priceCake - priceCake * 0.45;
        double animator = hallRent / 3;
        double budget = hallRent + priceCake + priceDrinks + animator;
        System.out.println(budget);
    }
}
