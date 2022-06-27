package PBExam.October2021;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double rewardSum = dancers * points;

        switch (place) {
            case "Bulgaria":
                switch (season) {
                    case "summer":
                        rewardSum = rewardSum - rewardSum * 0.05;
                        break;
                    case "winter":
                        rewardSum = rewardSum - rewardSum * 0.08;
                        break;
                }
                break;
            case "Abroad":
                rewardSum = rewardSum + rewardSum * 0.50;
                switch (season) {
                    case "summer":
                        rewardSum = rewardSum - rewardSum * 0.10;
                        break;
                    case "winter":
                        rewardSum = rewardSum - rewardSum * 0.15;
                        break;
                }
                break;
        }
        double charitySum = rewardSum * 0.75;
        double leftSum = rewardSum - charitySum;
        double moneyForDancers = leftSum / dancers;
        System.out.printf("Charity - %.2f%n", charitySum);
        System.out.printf("Money per dancer - %.2f", moneyForDancers);
    }
}
