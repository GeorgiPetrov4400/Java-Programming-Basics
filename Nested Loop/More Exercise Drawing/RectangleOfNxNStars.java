package NestedLoop.MoreExerciseDrawing;

import java.util.Scanner;

import static NestedLoop.MoreExerciseDrawing.RectangleOf10x10Stars.generateFrom;

public class RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String symbol = "*";
        for (int i = 0; i < n; i++) {
            System.out.println(generateFrom(n, symbol));
        }
    }

    public static String generateFrom(int numberOfStars, String symbol) {
        StringBuffer builder = new StringBuffer();
        for (int j = 0; j < numberOfStars; j++) {
            builder.append(symbol);
        }
        return builder.toString();
    }
}


