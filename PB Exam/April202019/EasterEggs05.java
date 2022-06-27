package PBExam.April202019;

import java.util.Scanner;

public class EasterEggs05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());

        String colour = scanner.nextLine();
        int countRed = 0;
        int countOrange = 0;
        int countBlue = 0;
        int countGreen = 0;
        int totalCount = 0;
        int max = Integer.MIN_VALUE;
        boolean isFinished = false;
        String colorEggs = "";

        for (int i = 1; i <= eggs; i++) {
            switch (colour) {
                case "red":
                    countRed++;
                    totalCount++;
                    break;
                case "orange":
                    countOrange++;
                    totalCount++;
                    break;
                case "blue":
                    countBlue++;
                    totalCount++;
                    break;
                case "green":
                    countGreen++;
                    totalCount++;
                    break;
            }
            if (countRed > max) {
                max = countRed;
                colorEggs = "red";
            }
            if (countOrange > max) {
                max = countOrange;
                colorEggs = "orange";
            }
            if (countBlue > max) {
                max = countBlue;
                colorEggs = "blue";
            }
            if (countGreen > max) {
                max = countGreen;
                colorEggs = "green";
            }
            if (totalCount == eggs) {
                isFinished = true;
                break;
            }
            colour = scanner.nextLine();
        }
        if (isFinished) {
            System.out.printf("Red eggs: %d%n", countRed);
            System.out.printf("Orange eggs: %d%n", countOrange);
            System.out.printf("Blue eggs: %d%n", countBlue);
            System.out.printf("Green eggs: %d%n", countGreen);
        }
        System.out.printf("Max eggs: %d -> %s", max, colorEggs);
    }
}
