package PBExam.July062019;

import java.util.Scanner;

public class PCGameShop05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesNumber = Integer.parseInt(scanner.nextLine());

        double countHeartstone = 0;
        double countFornite = 0;
        double countOverwatch = 0;
        double countOthers = 0;

        for (int i = 1; i <= gamesNumber; i++) {
            String gamesName = scanner.nextLine();
            switch (gamesName) {
                case "Hearthstone":
                    countHeartstone++;
                    break;
                case "Fornite":
                    countFornite++;
                    break;
                case "Overwatch":
                    countOverwatch++;
                    break;
                default:
                    countOthers++;
                    break;
            }

        }
        System.out.printf("Hearthstone - %.2f%%%n", countHeartstone / gamesNumber * 100);
        System.out.printf("Fornite - %.2f%%%n", countFornite / gamesNumber * 100);
        System.out.printf("Overwatch - %.2f%%%n", countOverwatch / gamesNumber * 100);
        System.out.printf("Others - %.2f%%", countOthers / gamesNumber * 100);

    }
}
