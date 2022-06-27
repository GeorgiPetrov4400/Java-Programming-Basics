package PBExam.June152019;

import java.util.Scanner;

public class MovieDay02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filmingTime = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int sceneTime = Integer.parseInt(scanner.nextLine());

        double terrainPrepare = filmingTime * 0.15;
        double timeForFilming = scenes * sceneTime;
        double allTime = terrainPrepare + timeForFilming;
        if (allTime <= filmingTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",
                    filmingTime - allTime);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", allTime - filmingTime);
        }
    }
}
