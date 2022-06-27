package PBExam.June152019;

import java.util.Scanner;

public class FavoriteMovie06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int count = 0;
        String movie = "";
        double maxSum = 0.0;

        while (!text.equals("STOP")) {
            double sum = 0.0;

            for (int i = 0; i <= text.length() - 1; i++) {
                int textNumber = text.length();
                char symbol = text.charAt(i);
                if (symbol >= 65 && symbol <= 90) {
                    int symbolNum = symbol;
                    symbolNum = symbolNum - textNumber;
                    sum += symbolNum;
                } else if (symbol >= 97 && symbol <= 122) {
                    int symbolNum2 = symbol;
                    symbolNum2 = symbolNum2 - textNumber * 2;
                    sum += symbolNum2;
                } else {
                    int symbolNum3 = symbol;
                    sum += symbolNum3;
                }

            }
            if (sum > maxSum) {
                maxSum = sum;
                movie = text;
            }
            count++;
            if (count == 7) {
                System.out.println("The limit is reached.");
                break;
            }

            text = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %.0f ASCII sum.", movie, maxSum);
    }
}
