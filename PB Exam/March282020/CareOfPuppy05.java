package PBExam.March282020;

import java.util.Scanner;

public class CareOfPuppy05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodInKg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int eatenFoodInGrams = 0;

        while (!input.equals("Adopted")) {
            int foodInGrams = Integer.parseInt(input);
            eatenFoodInGrams += foodInGrams;

            input = scanner.nextLine();
        }
        int totalFood = foodInKg * 1000;
        if (eatenFoodInGrams <= totalFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", totalFood - eatenFoodInGrams);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", eatenFoodInGrams - totalFood);
        }
    }
}
