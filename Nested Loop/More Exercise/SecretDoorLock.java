package NestedLoop.MoreExercise;

import java.util.Scanner;

public class SecretDoorLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endHundreds = Integer.parseInt(scanner.nextLine());
        int endTens = Integer.parseInt(scanner.nextLine());
        int endOnes = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= endHundreds; i++) {
            for (int j = 1; j <= endTens; j++) {
                for (int k = 1; k <= endOnes; k++) {
                    if (k % 2 == 0 && i % 2 == 0 && (j == 2 || j == 3 || j == 5 || j == 7)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
