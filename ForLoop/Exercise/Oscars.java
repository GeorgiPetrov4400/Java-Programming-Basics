package ForLoop.Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int evaluator = Integer.parseInt(scanner.nextLine());

        double pointsActor = 0.0;
        double totalPoints = 0.0;

        for (int i = 1; i <= evaluator; i++) {
            String nameEvaluator = scanner.nextLine();
            double pointsEvaluator = Double.parseDouble(scanner.nextLine());
            pointsActor += (nameEvaluator.length() * pointsEvaluator) / 2;
            totalPoints = points + pointsActor;
            if (totalPoints >= 1250.50) {
                break;
            }
        }
        if (totalPoints >= 1250.50) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",
                    actor, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.50 - totalPoints);
        }
    }
}
