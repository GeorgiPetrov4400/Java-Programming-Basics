package PBExam.March092019;

import java.util.Scanner;

public class BasketballTournament06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameTournament = scanner.nextLine();

        int countWin = 0;
        int countLost = 0;
        int countAll = 0;

        while (!nameTournament.equals("End of tournaments")) {
            int matches = Integer.parseInt(scanner.nextLine());
            countAll += matches;
            for (int i = 1; i <= matches; i++) {
                int pointsDesi = Integer.parseInt(scanner.nextLine());
                int pointsOpponent = Integer.parseInt(scanner.nextLine());

                if (pointsDesi > pointsOpponent) {
                    countWin++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",
                            i, nameTournament, pointsDesi - pointsOpponent);
                } else {
                    countLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",
                            i, nameTournament, pointsOpponent - pointsDesi);
                }
            }
            nameTournament = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", countWin * 1.0 / countAll * 100);
        System.out.printf("%.2f%% matches lost", countLost * 1.0 / countAll * 100);
    }
}

