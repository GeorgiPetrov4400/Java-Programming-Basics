package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String task = scanner.nextLine();

        int gradeCount = 0;
        double sumGrade = 0.0;
        int countProblem = 0;
        boolean problem = false;
        String lastTask = "";

        while (!task.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            sumGrade += grade;
            gradeCount++;
            lastTask = task;
            if (grade <= 4) {
                countProblem++;
                if (countProblem == n) {
                    problem = true;
                    break;
                }
            }
            task = scanner.nextLine();
        }
        if (problem) {
            System.out.printf("You need a break, %d poor grades.", countProblem);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrade / gradeCount);
            System.out.printf("Number of problems: %d%n", gradeCount);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}
