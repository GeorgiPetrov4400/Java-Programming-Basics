package ConditionalStatements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSecond = Double.parseDouble(scanner.nextLine());
        double distanceInMeter = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double distance = distanceInMeter * secondsPerMeter;
        double resistance = Math.floor(distanceInMeter / 15) * 12.5;
        double totalTime = distance + resistance;
        double neededTime = totalTime - recordInSecond;

        if (totalTime >= recordInSecond) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededTime);
        }
        if (totalTime < recordInSecond) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }

    }
}
