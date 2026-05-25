package TaskBreakContinue;

import java.util.Scanner;

public class TaskBreakContinue {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        {
            int sum = 0;
            while (true) {
                int number = scanner.nextInt();
                System.out.println("Введите число: ");

                if (number < 0) {
                        break;
                    }
                sum = sum + number;
            }
            System.out.println(sum);
        }

        // 2
        {
            for (int i = 1; i <= 20; i++) {
                if (i % 3 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }

        // 3
        {
            while (true) {
                System.out.println("Введите число: ");
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                if (number < 0) {
                    continue;
                }
                System.out.println(number);
            }
        }

        // 4
        {
            scanner.nextLine();
            while (true) {
                System.out.println("Введите команду: ");
                String command = scanner.nextLine();
                if (command.equals("stop")) {
                    break;
                }
                System.out.println(command);
            }
        }
    }
}
