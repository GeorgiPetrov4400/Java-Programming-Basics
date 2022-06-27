package WhileLoop.MoreExercise;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottle = Integer.parseInt(scanner.nextLine());

        int detergent = bottle * 750;
        int count = 0;
        int cleanPlates = 0;
        int cleanPots = 0;
        boolean isFinished = false;
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);
            count++;
            if (count % 3 == 0) {
                cleanPots += dishes;
                detergent -= dishes * 15;
                count = 0;
            } else {
                cleanPlates += dishes;
                detergent -= dishes * 5;
            }
            if (detergent < 0) {
                isFinished = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isFinished) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", cleanPlates, cleanPots);
            System.out.printf("Leftover detergent %d ml.", detergent);
        }
    }
}
