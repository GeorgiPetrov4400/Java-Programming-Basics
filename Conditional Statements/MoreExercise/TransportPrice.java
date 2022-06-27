package ConditionalStatements.MoreExcersices;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();

        double dayTaxi = 0.70 + km * 0.79;
        double nightTaxi = 0.70 + km * 0.90;
        double bus = 0.09 * km;
        double train = 0.06 * km;

        if (km >= 100) {
            System.out.printf("%.2f", train);
        } else if (km >= 20) {
            System.out.printf("%.2f", bus);
        } else if (name.equals("day")) {
            System.out.printf("%.2f", dayTaxi);
        } else if (name.equals("night")) {
            System.out.printf("%.2f", nightTaxi);
        }

    }
}

