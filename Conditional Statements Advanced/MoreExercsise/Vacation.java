package ConditionalStatementsAdvanced.MoreExcercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        switch (season) {
            case "Summer":
                if (budget <= 1000) {
                    System.out.printf("Alaska - Camp - %.2f", budget * 0.65);
                } else if (budget > 1000 && budget <= 3000) {
                    System.out.printf("Alaska - Hut - %.2f", budget * 0.80);
                } else if (budget > 3000) {
                    System.out.printf("Alaska - Hotel - %.2f", budget * 0.90);
                }
                break;
            case "Winter":
                if (budget <= 1000) {
                    System.out.printf("Morocco - Camp - %.2f", budget * 0.45);
                } else if (budget > 1000 && budget <= 3000) {
                    System.out.printf("Morocco - Hut - %.2f", budget * 0.60);
                } else if (budget > 3000) {
                    System.out.printf("Morocco - Hotel - %.2f", budget * 0.90);
                }
                break;
        }
    }
}
