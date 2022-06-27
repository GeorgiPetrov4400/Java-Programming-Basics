package NestedLoop.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());

        String presentation = scanner.nextLine();
        double averageGrade = 0.0;
        int count = 0;
        while (!presentation.equals("Finish")) {
            double sumGrade = 0.0;
            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrade += grade;
                count++;
            }
            averageGrade += sumGrade;
            System.out.printf("%s - %.2f.%n", presentation, sumGrade / jury);

            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", averageGrade / count);
    }
}
