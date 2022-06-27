package NestedLoop.MoreExercise;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char begin = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);
        char without = scanner.next().charAt(0);

        int count = 0;

        for (char i = begin; i <= end; i++) {
            for (char j = begin; j <= end; j++) {
                for (char k = begin; k <= end; k++) {
                    if (i == without || j == without || k == without) {
                        continue;
                    } else {
                        count++;
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }

            }

        }
        System.out.print(count);

    }
}
