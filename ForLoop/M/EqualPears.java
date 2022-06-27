package ForLoop.MoreExercise;

import java.util.Scanner;

public class EqualPears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int previousValue = Integer.MIN_VALUE;
        int diff = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        boolean equal = true;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());
            int sum = number + number2;

            if (i > 1) {
                if (sum != previousValue) {
                    int different = Math.abs(sum - previousValue);
                    equal = false;
                    if (different > max) {
                        max = different;
                    }
                    diff = different;
                }
            }
            previousValue = sum;
        }
        if (equal) {
            System.out.printf("Yes, value=%d", previousValue);
        } else {
            System.out.printf("No, maxdiff=%d", max);
        }
    }
}
