package PBExam.July062019;

import javax.swing.plaf.SeparatorUI;
import java.util.Locale;
import java.util.Scanner;

public class TheMostPowerfulWord06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        double maxSum = Double.MIN_VALUE;
        String powerfulWord = "";

        while (!word.equals("End of words")) {

            double sum = 0.0;
            for (int i = 0; i <= word.length() - 1; i++) {
                char symbol = word.charAt(i);
                sum += symbol;
            }
            String powerWord = word.toLowerCase();
            char firstSymbol = powerWord.charAt(0);
            switch (firstSymbol) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    sum = sum * word.length();
                    break;
                default:
                    sum = Math.floor(sum / word.length());
                    break;
            }
            if (sum > maxSum) {
                maxSum = sum;
                powerfulWord = word;
            }

            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", powerfulWord, maxSum);
    }
}
