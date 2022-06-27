package ForLoop.MoreExercise;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        double count5 = 0;
        double count4 = 0;
        double count3 = 0;
        double count2 = 0;
        double average = 0.0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 5.00) {
                count5++;
                average += grade;
            } else if (grade >= 4.00 && grade <= 4.99) {
                count4++;
                average += grade;
            } else if (grade >= 3.00 && grade <= 3.99) {
                count3++;
                average += grade;
            } else if (grade >= 2.00 && grade <= 2.99) {
                count2++;
                average += grade;
            }
        }
        System.out.printf("Top students: %.2f%%%n", count5 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", count4 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", count3 / students * 100);
        System.out.printf("Fail: %.2f%%%n", count2 / students * 100);
        System.out.printf("Average: %.2f", average / students);
    }
}
