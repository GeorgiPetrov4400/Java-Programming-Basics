package ConditionalStatementsAdvanced.MoreExcercise;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        switch (season) {
            case "Summer":
                if (budget <= 100) {
                    System.out.println("Economy class");
                    System.out.printf("Cabrio - %.2f", budget * 0.35);
                } else if (budget > 100 && budget <= 500) {
                    System.out.println("Compact class");
                    System.out.printf("Cabrio - %.2f", budget * 0.45);
                } else if (budget > 500) {
                    System.out.println("Luxury class");
                    System.out.printf("Jeep - %.2f", budget * 0.90);
                }
                break;
            case "Winter":
                if (budget <= 100) {
                    System.out.println("Economy class");
                    System.out.printf("Jeep - %.2f", budget * 0.65);
                } else if (budget > 100 && budget <= 500) {
                    System.out.println("Compact class");
                    System.out.printf("Jeep - %.2f", budget * 0.80);
                } else if (budget > 500) {
                    System.out.println("Luxury class");
                    System.out.printf("Jeep - %.2f", budget * 0.90);
                }
                break;
        }
    }
}
