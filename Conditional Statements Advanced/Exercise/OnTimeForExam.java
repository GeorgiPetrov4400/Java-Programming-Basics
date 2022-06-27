package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinute = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arriveTime = arriveHour * 60 + arriveMinute;

        if (examTime < arriveTime) {
            if (Math.abs(examTime - arriveTime) < 60) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", Math.abs(examTime - arriveTime));
            } else if (Math.abs(examTime - arriveTime) >= 60) {
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start",
                        (arriveTime - examTime) / 60, (arriveTime - examTime) % 60);
            }
        } else if (arriveTime == examTime) {
            System.out.println("On time");
        } else if (arriveTime >= (examTime - 30)) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start", Math.abs(arriveTime - examTime));
        } else if (arriveTime < (examTime - 30)) {
            if (Math.abs(examTime - arriveTime) < 60) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start", Math.abs(examTime - arriveTime));
            } else {
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start",
                        (examTime - arriveTime) / 60, (examTime - arriveTime) % 60);
            }

        }
    }
}
