package PBExam.June152019;

import java.util.Scanner;

public class SeriesCalculator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSerial = scanner.nextLine();
        int season = Integer.parseInt(scanner.nextLine());
        int episode = Integer.parseInt(scanner.nextLine());
        double episodeDuration = Double.parseDouble(scanner.nextLine());

        double advertise = episodeDuration * 0.20;
        double allDuration = episodeDuration + advertise;
        int additionalTime = season * 10;
        double totalTime = allDuration * season * episode + additionalTime;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",
                nameSerial, Math.floor(totalTime));
    }
}
