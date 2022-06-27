package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    static int getMax(int first, int second) {
        if (first >= second) {
            return first;
        } else {
            return second;
        }
    }

    static char getMax(char first, char second) {
        if (second >= first) {
            return second;
        } else {
            return first;
        }
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        if (type.equals("int")) {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            int max = getMax(first, second);
            System.out.println(max);
        } else if (type.equals("char")) {
            char first = scanner.next().charAt(0);
            char second = scanner.next().charAt(0);
            char max = getMax(first, second);
            System.out.println(max);
        } else if (type.equals("string")) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            String max = getMax(first, second);
            System.out.println(max);
        }
    }
}
