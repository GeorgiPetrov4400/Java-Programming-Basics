package ConditionalStatementsAdvanced.MoreExcercise;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double boys = 0.0;
        double girls = 0.0;
        double mixed = 0.0;

        switch (season) {
            case "Winter":
                if (group.equals("boys")) {
                    boys = students * nights * 9.60;
                    if (students >= 50) {
                        System.out.printf("Judo %.2f lv.", boys * 0.50);
                    } else if (students >= 20) {
                        System.out.printf("Judo %.2f lv.", boys * 0.85);
                    } else if (students >= 10) {
                        System.out.printf("Judo %.2f lv.", boys * 0.95);
                    } else {
                        System.out.printf("Judo %.2f lv.", boys);
                    }
                } else if (group.equals("girls")) {
                    girls = students * nights * 9.60;
                    if (students >= 50) {
                        System.out.printf("Gymnastics %.2f lv.", girls * 0.50);
                    } else if (students >= 20) {
                        System.out.printf("Gymnastics %.2f lv.", girls * 0.85);
                    } else if (students >= 10) {
                        System.out.printf("Gymnastics %.2f lv.", girls * 0.95);
                    } else {
                        System.out.printf("Gymnastics %.2f lv.", girls);
                    }
                } else if (group.equals("mixed")) {
                    mixed = students * nights * 10;
                    if (students >= 50) {
                        System.out.printf("Ski %.2f lv.", mixed * 0.50);
                    } else if (students >= 20) {
                        System.out.printf("Ski %.2f lv.", mixed * 0.85);
                    } else if (students >= 10) {
                        System.out.printf("Ski %.2f lv.", mixed * 0.95);
                    } else {
                        System.out.printf("Ski %.2f lv.", mixed);
                    }
                }
                break;
            case "Spring":
                if (group.equals("boys")) {
                    boys = students * nights * 7.20;
                    if (students >= 50) {
                        System.out.printf("Tennis %.2f lv.", boys * 0.50);
                    } else if (students >= 20) {
                        System.out.printf("Tennis %.2f lv.", boys * 0.85);
                    } else if (students >= 10) {
                        System.out.printf("Tennis %.2f lv.", boys * 0.95);
                    } else {
                        System.out.printf("Tennis %.2f lv.", boys);
                    }
                } else if (group.equals("girls")) {
                    girls = students * nights * 7.20;
                    if (students >= 50) {
                        System.out.printf("Athletics %.2f lv.", girls * 0.50);
                    } else if (students >= 20) {
                        System.out.printf("Athletics %.2f lv.", girls * 0.85);
                    } else if (students >= 10) {
                        System.out.printf("Athletics %.2f lv.", girls * 0.95);
                    } else {
                        System.out.printf("Athletics %.2f lv.", girls);
                    }
                } else if (group.equals("mixed")) {
                    mixed = students * nights * 9.50;
                    if (students >= 50) {
                        System.out.printf("Cycling %.2f lv.", mixed * 0.50);
                    } else if (students >= 20) {
                        System.out.printf("Cycling %.2f lv.", mixed * 0.85);
                    } else if (students >= 10) {
                        System.out.printf("Cycling %.2f lv.", mixed * 0.95);
                    } else {
                        System.out.printf("Cycling %.2f lv.", mixed);
                    }
                }
                break;
            case "Summer":
                if (group.equals("boys")) {
                    boys = students * nights * 15;
                    if (students >= 50) {
                        System.out.printf("Football %.2f lv.", boys * 0.50);
                    } else if (students >= 20) {
                        System.out.printf("Football %.2f lv.", boys * 0.85);
                    } else if (students >= 10) {
                        System.out.printf("Football %.2f lv.", boys * 0.95);
                    } else {
                        System.out.printf("Football %.2f lv.", boys);
                    }
                } else if (group.equals("girls")) {
                    girls = students * nights * 15;
                    if (students >= 50) {
                        System.out.printf("Volleyball %.2f lv.", girls * 0.50);
                    } else if (students >= 20) {
                        System.out.printf("Volleyball %.2f lv.", girls * 0.85);
                    } else if (students >= 10) {
                        System.out.printf("Volleyball %.2f lv.", girls * 0.95);
                    } else {
                        System.out.printf("Volleyball %.2f lv.", girls);
                    }

                } else if (group.equals("mixed")) {
                    mixed = students * nights * 20;
                    if (students >= 50) {
                        System.out.printf("Swimming %.2f lv.", mixed * 0.50);
                    } else if (students >= 20) {
                        System.out.printf("Swimming %.2f lv.", mixed * 0.85);
                    } else if (students >= 10) {
                        System.out.printf("Swimming %.2f lv.", mixed * 0.95);
                    } else {
                        System.out.printf("Swimming %.2f lv.", mixed);
                    }
                }
                break;
        }
    }
}
