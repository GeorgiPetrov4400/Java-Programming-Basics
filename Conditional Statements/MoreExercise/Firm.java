package ConditionalStatements.MoreExcersices;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());

        double workingTime = (days - days * 0.10) * 8;
        double extraWork = employees * (2 * days);
        double totalHours = Math.floor(workingTime + extraWork);

        if (totalHours >= hours) {
            System.out.printf("Yes!%.0f hours left.", totalHours - hours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", hours - totalHours);
        }
    }
}
