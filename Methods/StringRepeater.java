package Methods;

import java.util.Scanner;

public class StringRepeater {
    static String repeatString(String string, int count) {
        String repeatString = "";
        String repeated = repeatString.repeat(count);
        return string;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        //String repeated = string.repeat(count);
        //System.out.println(repeated);
        for (int i = 0; i < count; i++) {
            System.out.print(string);
        }
    }
}
