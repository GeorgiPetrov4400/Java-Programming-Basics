package ConditionalStatements.MoreExcersices;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidays = Integer.parseInt(scanner.nextLine());

        int workingDays = 365 - holidays;

        int timeForPlayWorkingDays = workingDays * 63;
        int timeForPlayHolidays = holidays * 127;
        int timeForPlay = timeForPlayWorkingDays + timeForPlayHolidays;
        int timeLeft = Math.abs(timeForPlay - 30000);
        double hours = timeLeft / 60;
        double minutes = timeLeft % 60;

        if (timeForPlay > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", hours, minutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", hours, minutes);
        }
    }
}
