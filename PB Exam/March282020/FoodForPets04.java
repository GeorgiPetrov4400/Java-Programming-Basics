package PBExam.March282020;

import java.util.Scanner;

public class FoodForPets04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double sumDogFood = 0.0;
        double sumCatFood = 0.0;
        double sumBisquits = 0.0;
        int countDay = 0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            sumDogFood += dogFood;
            sumCatFood += catFood;
            countDay++;
            if (countDay % 3 == 0) {
                double bisquits = (dogFood + catFood) * 0.10;
                sumBisquits += bisquits;
            }
        }
        double totalDogAndCat = sumDogFood + sumCatFood;
        System.out.printf("Total eaten biscuits: %.0fgr.%n", sumBisquits);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalDogAndCat / food * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", sumDogFood / totalDogAndCat * 100);
        System.out.printf("%.2f%% eaten from the cat.", sumCatFood / totalDogAndCat * 100);
    }
}
