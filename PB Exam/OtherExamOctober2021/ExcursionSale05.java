package PBExam.OtherExamOctober2021;

import java.util.Scanner;

public class ExcursionSale05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaPacket = Integer.parseInt(scanner.nextLine());
        int mountainPacket = Integer.parseInt(scanner.nextLine());
        String text = scanner.nextLine();

        int profit = 0;
        int sumProfit = 0;

        while (!text.equals("Stop")) {
            if (text.equals("sea")) {
                if (seaPacket > 0) {
                    profit = 680;
                    sumProfit += profit;
                    seaPacket--;
                } else {
                    profit = 0;
                }

            } else if (text.equals("mountain")) {
                if (mountainPacket >= 0) {
                    profit = 499;
                    sumProfit += profit;
                    mountainPacket--;
                } else {
                    profit = 0;
                }
            }
            if (seaPacket == 0 && mountainPacket == 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }
            text = scanner.nextLine();
        }
        System.out.printf("Profit: %d leva.", sumProfit);
    }
}
