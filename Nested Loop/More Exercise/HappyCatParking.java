package NestedLoop.MoreExercise;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());
        int hourNumber = Integer.parseInt(scanner.nextLine());

        int countDays = 0;
        double hourSum = 0.0;
        double totalSum = 0.0;

        for (int days = 1; days <= dayNumber; days++) {
            countDays++;
            double daySum = 0.0;
            for (int hours = 1; hours <= hourNumber; hours++) {
                if (days % 2 == 0 && hours % 2 != 0) {
                    hourSum = 2.50;
                    daySum += hourSum;
                } else if (days % 2 != 0 && hours % 2 == 0) {
                    hourSum = 1.25;
                    daySum += hourSum;
                } else {
                    hourSum = 1;
                    daySum += hourSum;
                }
            }
            totalSum += daySum;
            System.out.printf("Day: %d - %.2f leva%n", countDays, daySum);
        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}
