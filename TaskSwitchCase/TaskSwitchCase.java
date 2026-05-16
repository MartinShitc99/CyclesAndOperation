package TaskSwitchCase;

import java.util.Scanner;

public class TaskSwitchCase {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.println("Введите число дня недели: ");
        int dayOfWeek = scanner.nextInt();
        System.out.println(dayOfWeek(dayOfWeek));

        // 2
        System.out.println("Введите номер дня недели: ");
        int day = scanner.nextInt();
        System.out.println(priceTicket(day));

        // 3
        System.out.println("Введите количество баллов: ");
        int point = scanner.nextInt();
        System.out.println(numEstimates(point));

        // 4
        scanner.nextLine();
        System.out.println("Введите команду: start/stop/restart");
        String status = scanner.nextLine();
        System.out.println(requestStatus(status));

        // 5
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введите оператора: /, *, +, -");
        String operator = scanner.nextLine();
        System.out.println(simpleCalculate(num1, num2, operator));
    }


    // 1
    public static String dayOfWeek(int day) {
        switch (day) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Нет такого дня";
        }
    }

    // 2
    public static int priceTicket(int day) {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Стоимость билета: 300 руб.");
                break;
            case 6:
            case 7:
                System.out.println("Стоимость билета: 450 руб.");
                break;
            default:
                System.out.println("Нет такого дня");
                break;
        }
        return day;
    }

    // 3
    public static int numEstimates(int score) {
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("F");
                break;
            default:
                System.out.println("Ниже некуда");
                break;
        }
        return score;
    }

    // 4
    public static String requestStatus(String status) {
        switch (status.toLowerCase()) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            default:
                System.out.println("Нет такой команды");
                break;
        }
        return status;
    }

    // 5
    public static String simpleCalculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                System.out.println("Результат прибавления: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Результат вычетания: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Результат умножения: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Результат деления: " + (num1 / num2));
                } else {
                    System.out.println("На 0 делить нельзя!");
                }
                break;
            default:
                System.out.println("Нет такого оператора");
                break;
        }
        return operator;
    }
}

