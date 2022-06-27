package PBExam.March282020;

import java.util.Scanner;

public class MountainRun02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeter = Double.parseDouble(scanner.nextLine());
        double timeInSecondsPerMeter = Double.parseDouble(scanner.nextLine());

        double timeInSeconds = distanceInMeter * timeInSecondsPerMeter;
        double delayTime = Math.floor(distanceInMeter / 50) * 30;
        double totalTime = timeInSeconds + delayTime;
        if (totalTime >= recordInSeconds) {
            System.out.printf("No! He was %.2f seconds slower.", totalTime - recordInSeconds);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }
    }
}
