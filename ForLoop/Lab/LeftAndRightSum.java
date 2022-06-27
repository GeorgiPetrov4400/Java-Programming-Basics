package ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i <= number; i++) {
            int leftNumber = Integer.parseInt(scanner.nextLine());
            sumLeft = sumLeft + leftNumber;
        }
        for (int i = 1; i <= number; i++) {
            int rightNumber = Integer.parseInt(scanner.nextLine());
            sumRight = sumRight + rightNumber;
        }
        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            int diff = Math.abs(sumLeft - sumRight);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
