package PBExam.April202019;

import java.util.Scanner;

public class EasterGuests02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double easterBread = Math.ceil(guests * 1.0 / 3);
        double eggs = guests * 2;
        double priceEasterBread = easterBread * 4;
        double priceEggs = eggs * 0.45;
        double totalPrice = priceEasterBread + priceEggs;

        if (totalPrice <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", easterBread, eggs);
            System.out.printf("He has %.2f lv. left.", budget - totalPrice);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", totalPrice - budget);
        }

    }
}
