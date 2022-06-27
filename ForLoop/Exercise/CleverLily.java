package ForLoop.Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toy = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;
        int money = 0;
        int toyCount = 0;


        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money = money + 10;
                sum = sum + money;
                sum = sum - 1;
            } else {
                toyCount++;
            }
        }
        sum = sum + toy * toyCount;

        if (sum >= laundryPrice) {
            System.out.printf("Yes! %.2f", sum - laundryPrice);
        } else {
            System.out.printf("No! %.2f", laundryPrice - sum);
        }

    }
}
