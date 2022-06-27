package PBExam.April202019;

import java.util.Scanner;

public class PaintingEggs03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sizeEggs = scanner.nextLine();
        String colorEggs = scanner.nextLine();
        int lot = Integer.parseInt(scanner.nextLine());

        double priceEggs = 0.0;

        switch (sizeEggs) {
            case "Large":
                switch (colorEggs) {
                    case "Red":
                        priceEggs = lot * 16;
                        System.out.printf("%.2f leva.", priceEggs * 0.65);
                        break;
                    case "Green":
                        priceEggs = lot * 12;
                        System.out.printf("%.2f leva.", priceEggs * 0.65);
                        break;
                    case "Yellow":
                        priceEggs = lot * 9;
                        System.out.printf("%.2f leva.", priceEggs * 0.65);
                        break;
                }
                break;
            case "Medium":
                switch (colorEggs) {
                    case "Red":
                        priceEggs = lot * 13;
                        System.out.printf("%.2f leva.", priceEggs * 0.65);
                        break;
                    case "Green":
                        priceEggs = lot * 9;
                        System.out.printf("%.2f leva.", priceEggs * 0.65);
                        break;
                    case "Yellow":
                        priceEggs = lot * 7;
                        System.out.printf("%.2f leva.", priceEggs * 0.65);
                        break;
                }
                break;
            case "Small":
                switch (colorEggs) {
                    case "Red":
                        priceEggs = lot * 9;
                        System.out.printf("%.2f leva.", priceEggs * 0.65);
                        break;
                    case "Green":
                        priceEggs = lot * 8;
                        System.out.printf("%.2f leva.", priceEggs * 0.65);
                        break;
                    case "Yellow":
                        priceEggs = lot * 5;
                        System.out.printf("%.2f leva.", priceEggs * 0.65);
                        break;
                }
                break;
        }
    }
}
