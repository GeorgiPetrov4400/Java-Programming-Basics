package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int dayCount = 0;
        int spendCount = 0;

        while (availableMoney < excursionMoney && spendCount < 5) {
            String text = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            dayCount++;
            if (text.equals("save")) {
                availableMoney += money;
                spendCount = 0;
            } else if (text.equals("spend")) {
                availableMoney -= money;
                spendCount += 1;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            }
        }
        if (spendCount == 5) {
            System.out.println("You can't save the money.");
            System.out.println(dayCount);
        }
        if (availableMoney >= excursionMoney) {
            System.out.printf("You saved the money for %d days.", dayCount);
        }
    }
}
