package PBExam.March282020;

import java.util.Scanner;

public class FitnessCard03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double fitnessCard = 0.0;

        switch (gender) {
            case "m":
                switch (sport) {
                    case "Gym":
                        fitnessCard = 42;
                        break;
                    case "Boxing":
                        fitnessCard = 41;
                        break;
                    case "Yoga":
                        fitnessCard = 45;
                        break;
                    case "Zumba":
                        fitnessCard = 34;
                        break;
                    case "Dances":
                        fitnessCard = 51;
                        break;
                    case "Pilates":
                        fitnessCard = 39;
                        break;
                }
                break;
            case "f":
                switch (sport) {
                    case "Gym":
                        fitnessCard = 35;
                        break;
                    case "Boxing":
                        fitnessCard = 37;
                        break;
                    case "Yoga":
                        fitnessCard = 42;
                        break;
                    case "Zumba":
                        fitnessCard = 31;
                        break;
                    case "Dances":
                        fitnessCard = 53;
                        break;
                    case "Pilates":
                        fitnessCard = 37;
                        break;
                }
                break;
        }
        if (age <= 19) {
            fitnessCard = fitnessCard * 0.80;
        }
        if (fitnessCard <= availableMoney) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", fitnessCard - availableMoney);
        }
    }
}
