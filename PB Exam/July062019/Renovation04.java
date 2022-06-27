package PBExam.July062019;

import java.util.Scanner;

public class Renovation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentWithoutPainting = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double areaForPaint = height * width * 4;
        double paintingArea = areaForPaint - areaForPaint * (percentWithoutPainting * 1.0 / 100);

        while (!input.equals("Tired!")) {
            int paintLitres = Integer.parseInt(input);
            paintingArea -= paintLitres;
            if (paintingArea < 0) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(paintingArea));
                return;
            } else if (paintingArea == 0) {
                System.out.println("All walls are painted! Great job, Pesho!");
                return;
            }

            input = scanner.nextLine();
        }
        System.out.printf("%.0f quadratic m left.", paintingArea);
    }
}
