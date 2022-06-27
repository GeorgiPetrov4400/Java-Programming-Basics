package PBExam.March092019;

import java.util.Scanner;

public class TennisRanklist05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournament = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int countTournament = 0;
        int countWin = 0;

        for (int i = 1; i <= tournament; i++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    points += 2000;
                    countTournament++;
                    countWin++;
                    break;
                case "F":
                    points += 1200;
                    countTournament++;
                    break;
                case "SF":
                    points += 720;
                    countTournament++;
                    break;
            }
        }
        int totalPoint = initialPoints + points;
        System.out.printf("Final points: %d%n", totalPoint);
        System.out.printf("Average points: %d%n", points / countTournament);
        System.out.printf("%.2f%%", countWin * 1.0/ countTournament * 100);
    }
}
