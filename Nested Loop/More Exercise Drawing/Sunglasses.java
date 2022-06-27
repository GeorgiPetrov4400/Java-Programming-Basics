package NestedLoop.MoreExerciseDrawing;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.print(generateFrom(2 * n, "*"));
        System.out.print(generateFrom(n, " "));
        System.out.print(generateFrom(2 * n, "*"));
        for (int i = 0; i < n - 2; i++) {
            if (i == (n - 1 / 2 - 1)) {
                System.out.print(generateFrom(n, "|"));
            } else {
                System.out.print(generateFrom(n, " "));
            }
            System.out.println();
        }
        System.out.print(generateFrom(2 * n, "*"));
        System.out.print(generateFrom(n, " "));
        System.out.print(generateFrom(2 * n, "*"));
    }
    public static String generateFrom(int numberOfStars, String symbol) {
        StringBuffer builder = new StringBuffer();
        for (int j = 0; j < numberOfStars; j++) {
            builder.append(symbol);
        }
        return builder.toString();
    }
}
