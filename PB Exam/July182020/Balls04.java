package PBExam.July182020;

import java.util.Scanner;

public class Balls04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balls = Integer.parseInt(scanner.nextLine());

        double points = 0;
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countBlack = 0;
        int countOther = 0;

        for (int i = 1; i <= balls; i++) {
            String color = scanner.nextLine();
            if (color.equals("red")) {
                points += 5;
                countRed++;
            } else if (color.equals("orange")) {
                points += 10;
                countOrange++;
            } else if (color.equals("yellow")) {
                points += 15;
                countYellow++;
            } else if (color.equals("white")) {
                points += 20;
                countWhite++;
            } else if (color.equals("black")) {
                points = Math.floor(points / 2);
                countBlack++;
            } else {
                countOther++;
            }
        }
        System.out.printf("Total points: %.0f%n", points);
        System.out.printf("Red balls: %d%n", countRed);
        System.out.printf("Orange balls: %d%n", countOrange);
        System.out.printf("Yellow balls: %d%n", countYellow);
        System.out.printf("White balls: %d%n", countWhite);
        System.out.printf("Other colors picked: %d%n", countOther);
        System.out.printf("Divides from black balls: %d", countBlack);
    }
}
