package PBExam.April202019;

import java.util.Scanner;

public class EasterLunch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());
        int eggPackage = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());

        double easterBreadPrice = easterBread * 3.20;
        double eggPackagePrice = eggPackage * 4.35;
        double cookiesPrice = cookies * 5.40;
        double eggPaint = eggPackage * 12 * 0.15;
        double totalCost = easterBreadPrice + eggPackagePrice + cookiesPrice + eggPaint;

        System.out.printf("%.2f", totalCost);
    }
}
