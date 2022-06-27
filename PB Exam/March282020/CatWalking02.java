package PBExam.March282020;

import java.util.Scanner;

public class CatWalking02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesPerDay = Integer.parseInt(scanner.nextLine());
        int walking = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int totalMinutesPerDay = minutesPerDay * walking;
        int caloriesPerDay = totalMinutesPerDay * 5;
        if (caloriesPerDay >= (calories / 2)) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesPerDay);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesPerDay);
        }
    }
}
