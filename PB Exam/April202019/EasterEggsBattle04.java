package PBExam.April202019;

import java.util.Scanner;

public class EasterEggsBattle04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPlayerEgg = Integer.parseInt(scanner.nextLine());
        int secondPlayerEgg = Integer.parseInt(scanner.nextLine());

        String text = scanner.nextLine();
        boolean first = false;
        boolean second = false;

        while (!text.equals("End of battle")) {
            if (text.equals("one")) {
                secondPlayerEgg -= 1;
            } else if (text.equals("two")) {
                firstPlayerEgg -= 1;
            }
            if (firstPlayerEgg == 0) {
                first = true;
                break;
            } else if (secondPlayerEgg == 0) {
                second = true;
                break;
            }
            text = scanner.nextLine();
        }
        if (first) {
            System.out.printf("Player one is out of eggs. " +
                    "Player two has %d eggs left.", secondPlayerEgg);
        } else if (second) {
            System.out.printf("Player two is out of eggs. " +
                    "Player one has %d eggs left.", firstPlayerEgg);
        } else {
            System.out.printf("Player one has %d eggs left.%n", firstPlayerEgg);
            System.out.printf("Player two has %d eggs left.", secondPlayerEgg);
        }

    }
}
