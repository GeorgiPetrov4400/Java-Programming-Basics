package Methods;

import java.util.Scanner;

public class Return {
    static String readFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        System.out.printf("%s %s", firstName, lastName);
    }
}
