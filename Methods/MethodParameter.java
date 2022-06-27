package Methods;

public class MethodParameter {
    static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", i);
        }
    }

    public static void main(String[] args) {
        printNumbers(5, 10);
    }
}
