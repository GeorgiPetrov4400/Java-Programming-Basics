package PBExam.April202019;

import java.util.Scanner;

public class EasterShop04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEggs = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int eggs = Integer.parseInt(scanner.nextLine());
        int countEggs = 0;
        boolean isFinished = false;

        while (!command.equals("Close")) {
            if (command.equals("Buy")) {
                if (initialEggs < eggs) {
                    isFinished = true;
                    break;
                }
                initialEggs -= eggs;
                countEggs += eggs;
            } else if (command.equals("Fill")) {
                initialEggs += eggs;
            }
            command = scanner.nextLine();
            if (command.equals("Close")) {
                System.out.println("Store is closed!");
                System.out.printf("%d eggs sold.", countEggs);
                break;
            }
            eggs = Integer.parseInt(scanner.nextLine());
        }
        if (isFinished) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", initialEggs);
        }

    }
}
