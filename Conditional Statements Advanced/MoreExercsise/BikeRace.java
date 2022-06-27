package ConditionalStatementsAdvanced.MoreExcercise;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorBikers = Integer.parseInt(scanner.nextLine());
        int seniorBikers = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        switch (trace) {
            case "trail":
                double juniorPrice = juniorBikers * 5.50;
                double seniorPrice = seniorBikers * 7;
                double totalPrice = juniorPrice + seniorPrice;
                System.out.printf("%.2f", totalPrice * 0.95);
                break;
            case "cross-country":
                double juniorPrice2 = juniorBikers * 8;
                double seniorPrice2 = seniorBikers * 9.50;
                double totalPrice2 = juniorPrice2 + seniorPrice2;
                if ((juniorBikers + seniorBikers) >= 50) {
                    totalPrice2 = totalPrice2 * 0.75;
                    System.out.printf("%.2f", totalPrice2 * 0.95);
                } else {
                    System.out.printf("%.2f", totalPrice2 * 0.95);
                }
                break;
            case "downhill":
                double juniorPrice3 = juniorBikers * 12.25;
                double seniorPrice3 = seniorBikers * 13.75;
                double totalPrice3 = juniorPrice3 + seniorPrice3;
                System.out.printf("%.2f", totalPrice3 * 0.95);
                break;
            case "road":
                double juniorPrice4 = juniorBikers * 20;
                double seniorPrice4 = seniorBikers * 21.50;
                double totalPrice4 = juniorPrice4 + seniorPrice4;
                System.out.printf("%.2f", totalPrice4 * 0.95);
                break;
        }

    }
}
