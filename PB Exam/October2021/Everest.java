package PBExam.October2021;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int initialMetres = 5364;
        int countDays = 1;

        while (!text.equals("END")) {
            int metres = Integer.parseInt(scanner.nextLine());
            if (text.equals("Yes")) {
                countDays++;
            }
            if (countDays > 5) {
                System.out.println("Failed!");
                System.out.printf("%d", initialMetres);
                break;
            }
            initialMetres += metres;
            if (initialMetres >= 8848) {
                System.out.printf("Goal reached for %d days!", countDays);
                break;
            }


            text = scanner.nextLine();
        }
        if (text.equals("END")) {
            System.out.println("Failed!");
            System.out.printf("%d", initialMetres);

        }
    }
}
