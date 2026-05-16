package TaskFor;

import java.util.Scanner;

public class TaskFor {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.println("Числа от 1 до 100 которые деляться на 3: ");

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // 2
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 1 до n " + n + " Равна: " + sum);

        // 3
        System.out.println("Введите число для таблицы умножения: ");
        int number = scanner.nextInt();
        System.out.println("Таблица умножения для числа " + number + ":");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        // 4
        System.out.println("Введите число для проверки: ");
        number = scanner.nextInt();

        if (number <= 1){
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            System.out.println(number + " - Простое число");
        } else {
            System.out.println(number + " - Число не простое");
        }

        // 5
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

}
