package WhileLoop.MoreExercise;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int countN = 0;
        int countO = 0;
        int countC = 0;
        String sumSymbol = "";

        while (!text.equals("End")) {
            switch (text) {
                case "n":
                    countN++;
                    break;
                case "o":
                    countO++;
                    break;
                case "c":
                    countC++;
                    break;
            }
            if (countN > 1 && text.equals("n")) {
                sumSymbol += text;
            }
            if (countO > 1 && text.equals("o")) {
                sumSymbol += text;
            }
            if (countC > 1 && text.equals("c")) {
                sumSymbol += text;
            }
            char check = text.charAt(0);
            if (!text.equals("n") && !text.equals("o") && !text.equals("c")
                    && Character.isAlphabetic(check)) {
                sumSymbol += text;
            }
            if (countN >= 1 && countO >= 1 && countC >= 1) {
                countC = 0;
                countN = 0;
                countO = 0;
                System.out.printf("%s ", sumSymbol);
                sumSymbol = "";
            }
            text = scanner.nextLine();
        }
    }
}
