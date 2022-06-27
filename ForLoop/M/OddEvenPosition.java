package ForLoop.MoreExercise;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());

        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double oddSum = 0.0;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;
        double evenSum = 0.0;

        if (n == 0) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
            return;
        }
        for (double i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 != 0) {
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
                if (n == 1) {
                    System.out.printf("OddSum=%.2f,%n", oddSum);
                    System.out.printf("OddMin=%.2f,%n", number);
                    System.out.printf("OddMax=%.2f,%n", number);
                    System.out.printf("EvenSum=%.2f,%n", evenSum);
                    System.out.printf("EvenMin=No,%n");
                    System.out.println("EvenMax=No");
                    return;
                }
            } else if (i % 2 == 0) {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        System.out.printf("OddMin=%.2f,%n", oddMin);
        System.out.printf("OddMax=%.2f,%n", oddMax);
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        System.out.printf("EvenMin=%.2f,%n", evenMin);
        System.out.printf("EvenMax=%.2f%n", evenMax);

    }
}