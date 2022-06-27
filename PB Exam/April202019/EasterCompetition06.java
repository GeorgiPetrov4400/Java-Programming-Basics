package PBExam.April202019;

import java.util.Scanner;

public class EasterCompetition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadNumber = Integer.parseInt(scanner.nextLine());

        String baker = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        String winner = "";

        for (int i = 1; i <= easterBreadNumber; i++) {
            String input = scanner.nextLine();
            int sumPoints = 0;

            while (!input.equals("Stop")) {
                int points = Integer.parseInt(input);
                sumPoints += points;

                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", baker, sumPoints);
            if (sumPoints > max) {
                max = sumPoints;
                winner = baker;
                System.out.printf("%s is the new number 1!%n", baker);
            }
            if (i == easterBreadNumber) {
                System.out.printf("%s won competition with %d points!", winner, max);
                break;
            }
            baker = scanner.nextLine();
        }
    }
}
