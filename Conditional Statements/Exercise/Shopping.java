package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videocardPrice = videocard * 250;
        double processorPrice = videocardPrice * 0.35;
        double ramPrice = videocardPrice * 0.10;
        double sum = videocardPrice + processor * processorPrice + ram * ramPrice;

        if (videocard > processor) {
            sum = sum * 0.85;
        }
        double totalSum = Math.abs(budget - sum);

        if (budget >= sum) {
            System.out.printf("You have %.2f leva left!", totalSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalSum);
        }
    }
}
