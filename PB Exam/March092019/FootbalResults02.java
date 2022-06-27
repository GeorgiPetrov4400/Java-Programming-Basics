package PBExam.March092019;

import java.util.Scanner;

public class FootbalResults02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstResult = scanner.nextLine();
        String secondResult = scanner.nextLine();
        String thirdResult = scanner.nextLine();

        int win = 0;
        int lost = 0;
        int draw = 0;

        char firstSymbol = firstResult.charAt(0);
        char lastSymbol = firstResult.charAt(2);

        if (firstSymbol > lastSymbol) {
            win += 1;
        } else if (firstSymbol < lastSymbol) {
            lost += 1;
        } else {
            draw += 1;
        }
        char secondSymbol = secondResult.charAt(0);
        char lastSymbol2 = secondResult.charAt(2);

        if (secondSymbol > lastSymbol2) {
            win += 1;
        } else if (secondSymbol < lastSymbol2) {
            lost += 1;
        } else {
            draw += 1;
        }
        char thirdSymbol = thirdResult.charAt(0);
        char lastSymbol3 = thirdResult.charAt(2);

        if (thirdSymbol > lastSymbol3) {
            win += 1;
        } else if (thirdSymbol < lastSymbol3) {
            lost += 1;
        } else {
            draw += 1;
        }
        System.out.printf("Team won %d games.%n", win);
        System.out.printf("Team lost %d games.%n", lost);
        System.out.printf("Drawn games: %d", draw);
    }
}
