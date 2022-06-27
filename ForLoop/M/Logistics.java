package ForLoop.MoreExercise;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cargo = Integer.parseInt(scanner.nextLine());

        int priceTons = 0;
        int sumTons = 0;
        int bus = 0;
        int truck = 0;
        int train = 0;

        for (int i = 1; i <= cargo; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            if (tons <= 3) {
                priceTons += tons * 200;
                sumTons += tons;
                bus += tons;
            } else if (tons > 3 && tons <= 11) {
                priceTons += tons * 175;
                sumTons += tons;
                truck += tons;
            } else {
                priceTons += tons * 120;
                sumTons += tons;
                train += tons;
            }
        }
        System.out.printf("%.2f%n", priceTons * 1.0 / sumTons);
        System.out.printf("%.2f%%%n", bus * 1.0 / sumTons * 100);
        System.out.printf("%.2f%%%n", truck * 1.0 / sumTons * 100);
        System.out.printf("%.2f%%%n", train * 1.0 / sumTons * 100);
    }
}
