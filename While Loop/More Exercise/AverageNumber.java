package WhileLoop.MoreExercise;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sumNumber = 0.0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sumNumber += number;
            count++;
        }
        System.out.printf("%.2f", sumNumber / count);
    }
}
