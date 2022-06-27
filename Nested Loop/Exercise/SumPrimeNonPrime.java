package NestedLoop.Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumSimple = 0;
        int sumNonSimple = 0;

        while (!input.equals("stop")) {
            boolean isNonPrime = false;
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isNonPrime = true;
                    break;
                }
            }
            if (isNonPrime) {
                sumNonSimple += number;
            } else {
                sumSimple += number;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumSimple);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonSimple);
    }
}
