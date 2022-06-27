package Methods;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = number.length(); i > 0 ; i--) {
            int num = Integer.parseInt(number);
            num = num / 10;
            System.out.println(i);
        }
    }
}
