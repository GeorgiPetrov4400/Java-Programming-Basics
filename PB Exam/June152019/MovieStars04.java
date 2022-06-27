package PBExam.June152019;

import java.util.Scanner;

public class MovieStars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("ACTION")) {
            if (input.length() <= 15) {
                double salary = Double.parseDouble(scanner.nextLine());
                budget -= salary;
            }
            if (input.length() > 15) {
                budget -= budget * 0.20;
            }
            if (budget < 0) {
                System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("We are left with %.2f leva.", budget);
    }
}
