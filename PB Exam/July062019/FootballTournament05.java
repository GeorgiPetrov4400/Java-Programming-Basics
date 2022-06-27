package PBExam.July062019;

import java.util.Scanner;

public class FootballTournament05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String footballTeam = scanner.nextLine();
        int gamesPlayed = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int countWin = 0;
        int countDraw = 0;
        int countLose = 0;

        if (gamesPlayed > 0) {
            for (int i = 1; i <= gamesPlayed; i++) {
                String symbol = scanner.nextLine();
                switch (symbol) {
                    case "W":
                        points += 3;
                        countWin++;
                        break;
                    case "D":
                        points += 1;
                        countDraw++;
                        break;
                    case "L":
                        countLose++;
                        break;
                }
            }
            System.out.printf("%s has won %d points during this season.%n", footballTeam, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", countWin);
            System.out.printf("## D: %d%n", countDraw);
            System.out.printf("## L: %d%n", countLose);
            System.out.printf("Win rate: %.2f%%", countWin * 1.0 / gamesPlayed * 100);
        } else {
            System.out.printf("%s hasn't played any games during this season.", footballTeam);
        }
    }
}
