package PBExam.March282020;

import java.util.Scanner;

public class TournamentOfChristmas06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int totalWin = 0;
        int totalLost = 0;
        double sumCharity = 0.0;

        for (int i = 1; i <= days; i++) {
            int countWin = 0;
            int countLost = 0;
            double charity = 0;

            String sport = scanner.nextLine();

            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    countWin++;
                    totalWin += countWin;
                    charity += 20;
                } else if (result.equals("lose")) {
                    countLost++;
                    totalLost += countLost;
                }

                sport = scanner.nextLine();
            }
            if (countWin > countLost) {
                charity = charity * 1.10;
                sumCharity += charity;
            } else {
                sumCharity += charity;
            }
        }
        if (totalWin > totalLost) {
            sumCharity = sumCharity * 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", sumCharity);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", sumCharity);
        }
    }
}
