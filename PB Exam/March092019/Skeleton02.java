package PBExam.March092019;

import java.util.Scanner;

public class Skeleton02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlMinutes = Integer.parseInt(scanner.nextLine());
        int controlSeconds = Integer.parseInt(scanner.nextLine());
        double beehiveMetres = Double.parseDouble(scanner.nextLine());
        int secondsPer100Metres = Integer.parseInt(scanner.nextLine());

        int allSeconds = controlMinutes * 60 + controlSeconds;
        double timeDelay = beehiveMetres / 120;
        double totalDelayTime = timeDelay * 2.5;
        double timeMarin = (beehiveMetres / 100) * secondsPer100Metres - totalDelayTime;

        if (timeMarin <= allSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeMarin);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", timeMarin - allSeconds);
        }
    }
}
