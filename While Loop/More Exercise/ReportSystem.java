package WhileLoop.MoreExercise;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expectedSum = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int count = 0;
        double sumCash = 0.0;
        double sumCard = 0.0;
        boolean isCollect = false;
        int countCash = 0;
        int countCard = 0;

        while (!input.equals("End")) {
            int money = Integer.parseInt(input);
            count++;
            if (count % 2 == 0) {
                if (money >= 10) {
                    sumCard += money;
                    countCash++;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            } else {
                if (money <= 100) {
                    sumCash += money;
                    countCard++;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            }
            double charitySum = sumCash + sumCard;
            if (charitySum >= expectedSum) {
                isCollect = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isCollect) {
            System.out.printf("Average CS: %.2f%n", sumCash / countCash);
            System.out.printf("Average CC: %.2f", sumCard / countCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
