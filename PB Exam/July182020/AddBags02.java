package PBExam.July182020;

import java.util.Scanner;

public class AddBags02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luggageOver20Kg = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int daysToTrip = Integer.parseInt(scanner.nextLine());
        int luggageNumber = Integer.parseInt(scanner.nextLine());

        double taxLuggage = 0.0;
        double totalTax = 0.0;

        if (luggageKg < 10) {
            taxLuggage = luggageOver20Kg * 0.20;
            totalTax += taxLuggage;
        }
        if (luggageKg >= 10 && luggageKg <= 20) {
            taxLuggage = luggageOver20Kg * 0.50;
            totalTax += taxLuggage;
        }
        if (luggageKg > 20) {
            taxLuggage = luggageOver20Kg;
            totalTax += taxLuggage;
        }
        if (daysToTrip < 7) {
            taxLuggage = taxLuggage * 0.40;
            totalTax += taxLuggage;
        }
        if (daysToTrip >= 7 && daysToTrip <= 30) {
            taxLuggage = taxLuggage * 0.15;
            totalTax += taxLuggage;
        }
        if (daysToTrip > 30) {
            taxLuggage = taxLuggage * 0.10;
            totalTax += taxLuggage;
        }
        double totalSum = totalTax * luggageNumber;
        System.out.printf("The total price of bags is: %.2f lv.", totalSum);
    }
}
