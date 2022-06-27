package PBExam.March092019;

import java.util.Scanner;

public class HighJump06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());

        int initialHeight = height - 30;
        int jumpCount = 0;
        boolean isFailed = false;

        while (initialHeight <= height) {
            for (int i = 0; i < 3; i++) {
                int currentJump = Integer.parseInt(scanner.nextLine());
                jumpCount++;
                if (currentJump > initialHeight) {
                    initialHeight += 5;
                    break;
                }
                if (i == 2) {
                    System.out.printf("Tihomir failed at %dcm after %d jumps.", initialHeight, jumpCount);
                    isFailed = true;
                }
            }
            if (isFailed) {
                break;
            }
        }
        if (!isFailed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", height, jumpCount);
        }
    }
}