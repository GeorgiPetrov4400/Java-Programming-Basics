package ForLoop.MoreExercise;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heritageMoney = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());

        int age = 17;
        double spent = 0.0;
        double sumMoney = heritageMoney - spent;

        for (int i = 1800; i <= yearToLive; i++) {
            if (i % 2 == 0) {
                spent = 12000;
                sumMoney = sumMoney - spent;
                age++;
            } else {
                age++;
                spent = 12000 + age * 50;
                sumMoney = sumMoney - spent;
            }
        }
        if (sumMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", sumMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(sumMoney));
        }
    }
}
