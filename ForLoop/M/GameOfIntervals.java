package ForLoop.MoreExercise;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sumNumbers = 0.0;
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= 0 && number <= 9) {
                sumNumbers += number * 0.20;
                count++;
            } else if (number >= 10 && number <= 19) {
                sumNumbers += number * 0.30;
                count2++;
            } else if (number >= 20 && number <= 29) {
                sumNumbers += number * 0.40;
                count3++;
            } else if (number >= 30 && number <= 39) {
                sumNumbers += 50;
                count4++;
            } else if (number >= 40 && number <= 50) {
                sumNumbers += 100;
                count5++;
            } else {
                sumNumbers = sumNumbers / 2;
                count6++;
            }
        }
        System.out.printf("%.2f%n", sumNumbers);
        System.out.printf("From 0 to 9: %.2f%%%n", count * 1.0 / n * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", count2 * 1.0 / n * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", count3 * 1.0 / n * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", count4 * 1.0 / n * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", count5 * 1.0 / n * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", count6 * 1.0 / n * 100);
    }
}
