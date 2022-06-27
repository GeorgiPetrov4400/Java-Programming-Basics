package PBExam.June152019;

import java.util.Scanner;

public class MovieDestination03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double totalBudget = 0.0;

        switch (season) {
            case "Summer":
                switch (destination) {
                    case "Dubai":
                        totalBudget = days * 40000 * 0.70;
                        break;
                    case "Sofia":
                        totalBudget = days * 12500 * 1.25;
                        break;
                    case "London":
                        totalBudget = days * 20250;
                        break;
                }
                break;
            case "Winter":
                switch (destination) {
                    case "Dubai":
                        totalBudget = days * 45000 * 0.70;
                        break;
                    case "Sofia":
                        totalBudget = days * 17000 * 1.25;
                        break;
                    case "London":
                        totalBudget = days * 24000;
                        break;
                }
                break;
        }
        if (totalBudget <= movieBudget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",
                    movieBudget - totalBudget);
        } else {
            System.out.printf("The director needs %.2f leva more!", totalBudget - movieBudget);
        }
    }
}
