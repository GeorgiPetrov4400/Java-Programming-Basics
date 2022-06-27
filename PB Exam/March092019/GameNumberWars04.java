package PBExam.March092019;

import java.util.Scanner;

public class GameNumberWars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPlayer = scanner.nextLine();
        String secondPlayer = scanner.nextLine();

        String input = scanner.nextLine();

        int sumFirstDiff = 0;
        int sumSecondDiff = 0;

        while (!input.equals("End of game")) {
            String input2 = scanner.nextLine();

            int firstNumber = Integer.parseInt(input);
            int secondNumber = Integer.parseInt(input2);

            if (firstNumber > secondNumber) {
                sumFirstDiff += firstNumber - secondNumber;
            } else if (secondNumber > firstNumber) {
                sumSecondDiff += secondNumber - firstNumber;
            } else {
                System.out.println("Number wars!");
                String lastNumber = scanner.nextLine();
                String lastNumber2 = scanner.nextLine();
                int last = Integer.parseInt(lastNumber);
                int last2 = Integer.parseInt(lastNumber2);
                if (last > last2) {
                    System.out.printf("%s is winner with %d points", firstPlayer, sumFirstDiff);
                    break;
                } else {
                    System.out.printf("%s is winner with %d points", secondPlayer, sumSecondDiff);
                    break;
                }
            }

            input = scanner.nextLine();
        }
        if (input.equals("End of game")) {
            System.out.printf("%s has %d points%n", firstPlayer, sumFirstDiff);
            System.out.printf("%s has %d points", secondPlayer, sumSecondDiff);
        }
    }
}
