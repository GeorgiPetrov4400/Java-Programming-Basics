package NestedLoop.MoreExerciseDrawing;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStars = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfStars; i++) {
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
