package PBExam.OtherExamOctober2021;

import java.util.Scanner;

public class BraceletStand02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());
        double costs = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double sumMoney = moneyPerDay * 5;
        double sumProfit = profitPerDay * 5;
        double savedMoney = sumMoney + sumProfit;
        double leftMoney = savedMoney - costs;

        if (leftMoney >= giftPrice) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", leftMoney);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - leftMoney);
        }
    }
}
