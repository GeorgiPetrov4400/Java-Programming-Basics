package NestedLoop.MoreExercise;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                for (int k = 1; k <= maxTables; k++) {
                    if (i == j) {
                        count++;
                        System.out.printf("(%d <-> %d) ", i, j);
                        break;
                    } else if (j > i) {
                        count++;
                        System.out.printf("(%d <-> %d) ", i, j);
                        break;
                    } else {
                        count++;
                        System.out.printf("(%d <-> %d) ", i, j);
                        break;
                    }
                }
                if (count == maxTables) {
                    return;
                }
            }
        }
    }
}
