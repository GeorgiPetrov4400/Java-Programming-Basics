package ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double timeLunch = breakTime / 8.0;
        double timeRest = breakTime / 4.0;
        double allTime = episode + timeLunch + timeRest;
        //double timeLeft = Math.abs(breakTime - allTime);

        if (allTime <= breakTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serial, Math.ceil(breakTime - allTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial, Math.ceil(allTime - breakTime));
        }



    }
}
