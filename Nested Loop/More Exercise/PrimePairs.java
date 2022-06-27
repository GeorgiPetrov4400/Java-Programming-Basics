package NestedLoop.MoreExercise;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginFirstPair = Integer.parseInt(scanner.nextLine());
        int beginSecondPair = Integer.parseInt(scanner.nextLine());
        int differenceFirstPair = Integer.parseInt(scanner.nextLine());
        int differenceSecondPair = Integer.parseInt(scanner.nextLine());

        int endFirstInterval = beginFirstPair + differenceFirstPair;
        int endSecondInterval = beginSecondPair + differenceSecondPair;
        int number = 0;
        int number2 = 0;

        for (int i = beginFirstPair; i <= endFirstInterval; i++) {
            for (int j = beginSecondPair; j <= endSecondInterval; j++) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 &&
                        j % 2 != 0 && j % 3 != 0 && j % 5 != 0 && j % 7 != 0) {
                    System.out.printf("%d%d%n", i, j);
                }
            }
        }
    }
}
