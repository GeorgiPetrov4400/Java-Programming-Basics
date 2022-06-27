package Methods;

import java.util.Scanner;

public class HelloName {
    static String printName(String name) {
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name+"!");
    }
}
