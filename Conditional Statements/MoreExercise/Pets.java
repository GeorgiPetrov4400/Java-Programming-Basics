package ConditionalStatements.MoreExcersices;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodInKg = Integer.parseInt(scanner.nextLine());
        double dogFoodInKg = Double.parseDouble(scanner.nextLine());
        double catFoodInKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodInGrams = Double.parseDouble(scanner.nextLine());

        double neededFoodDog = days * dogFoodInKg;
        double neededFoodCat = days * catFoodInKg;
        double neededFoodTurtle = days * turtleFoodInGrams / 1000;
        double totalFood = neededFoodDog + neededFoodCat + neededFoodTurtle;

        if (totalFood <= foodInKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodInKg - totalFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood - foodInKg));
        }
    }
}
