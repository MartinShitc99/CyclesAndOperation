package TaskDoWhile;

import java.util.Scanner;

public class TaskDoWhile {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        {
            int number = 0;
            do {
                System.out.println("Введите положительное число: ");
                number = scanner.nextInt();
            } while (number <= 0);
            System.out.println("Вы ввели: " + number);
        }

        // 2
        {
            scanner.nextLine();
            String correctPassword = "java";
            String inputPassword = "";

            do {
                System.out.println("Введите пароль");
                inputPassword = scanner.nextLine();

                if (!inputPassword.equals(correctPassword)) {
                    System.out.println("Неверный пароль");
                }
            } while (!inputPassword.equals(correctPassword));
            System.out.println("Доступ разрешен");
        }

        //3
        int i = 1;
        {
            do {
                System.out.println(i);
                i++;
            } while (i <= 10);
        }

        // 4
        String command = "";
        do {
            System.out.println("Введите команду: ");
            command = scanner.nextLine();

            if (!command.equals("exit")) {
                System.out.println("Команда выполнена: " + command);
            }
        } while (!command.equals("exit"));

        // 5
        {
            System.out.println("Введите целое число: ");
            int number = scanner.nextInt();
            int count = 0;

            int tempNumber = Math.abs(number);

            do {
                count++;
                tempNumber = tempNumber / 10;
            } while (tempNumber > 0);
            System.out.println("В числе: " + number + " количество цифр: " + count);
        }
    }
}

