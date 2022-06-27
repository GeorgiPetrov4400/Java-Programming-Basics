package Methods;

import java.util.Scanner;

public class MethodDifferentParameter {
    static void printStudent(String name, int age, double grade) {
        System.out.printf("Student: %s; Age: %d; Grade: %.2f", name, age, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        printStudent(name, age, grade);
    }
}
