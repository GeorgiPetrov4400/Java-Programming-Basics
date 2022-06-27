package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        if (dayTime.equals("Evening")) {
            System.out.printf("It's %s degrees, get your Shirt and Moccasins.", degrees);
        }
        if (dayTime.equals("Afternoon")) {
            if (degrees >= 10 && degrees <= 18) {
                System.out.printf("It's %s degrees, get your Shirt and Moccasins.", degrees);
            } else if (degrees > 18 && degrees <= 24) {
                System.out.printf("It's %s degrees, get your T-Shirt and Sandals.", degrees);
            } else if (degrees >= 25) {
                System.out.printf("It's %s degrees, get your Swim Suit and Barefoot.", degrees);
            }
        }
        if (dayTime.equals("Morning")) {
            if (degrees >= 10 && degrees <= 18) {
                System.out.printf("It's %s degrees, get your Sweatshirt and Sneakers.", degrees);
            } else if (degrees > 18 && degrees <= 24) {
                System.out.printf("It's %s degrees, get your Shirt and Moccasins.", degrees);
            } else if (degrees >= 25) {
                System.out.printf("It's %s degrees, get your T-Shirt and Sandals.", degrees);
            }
        }
    }
}
