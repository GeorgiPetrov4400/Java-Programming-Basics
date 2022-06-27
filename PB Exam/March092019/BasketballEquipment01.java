package PBExam.March092019;

import java.util.Scanner;

public class BasketballEquipment01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());

        double snickers = annualFee * 0.60;
        double equip = snickers * 0.80;
        double ball = equip / 4;
        double accessories = ball / 5;
        double totalSum = annualFee + snickers + equip + ball + accessories;

        System.out.printf("%.2f", totalSum);
    }
}
