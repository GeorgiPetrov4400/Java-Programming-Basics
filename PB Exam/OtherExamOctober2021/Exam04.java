package PBExam.OtherExamOctober2021;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int countGrade2 = 0;
        int countGrade3 = 0;
        int countGrade4 = 0;
        int countGrade5 = 0;
        double sumGrades = 0.0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 2.00 && grade <= 2.99) {
                countGrade2++;
                sumGrades += grade;
            }
            if (grade >= 3.00 && grade <= 3.99) {
                countGrade3++;
                sumGrades += grade;
            }
            if (grade >= 4.00 && grade <= 4.99) {
                countGrade4++;
                sumGrades += grade;
            }
            if (grade >= 5.00) {
                countGrade5++;
                sumGrades += grade;
            }
        }
        System.out.printf("Top students: %.2f%%%n", countGrade5 * 1.0 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", countGrade4 * 1.0 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", countGrade3 * 1.0 / students * 100);
        System.out.printf("Fail: %.2f%%%n", countGrade2 * 1.0 / students * 100);
        System.out.printf("%.2f", sumGrades / students);
    }
}
