package PBExam.July062019;

import java.util.Scanner;

public class FamilyTrip02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double familyBudget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int additionalCosts = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            pricePerNight = pricePerNight * 0.95;
        }
        double priceVacation = pricePerNight * nights;
        double priceAdditionalCosts = familyBudget * (additionalCosts * 1.0 / 100);
        double totalPrice = priceVacation + priceAdditionalCosts;

        if (totalPrice <= familyBudget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", familyBudget - totalPrice);
        } else {
            System.out.printf("%.2f leva needed.", totalPrice - familyBudget);
        }
    }
}
