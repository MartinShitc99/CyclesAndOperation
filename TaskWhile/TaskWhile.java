package TaskWhile;

import java.util.Scanner;

public class TaskWhile {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        {
            System.out.println("Введите число для вычисления факториала: ");
            int n = scanner.nextInt();
            int result = 1;
            int i = 1;
            while (i <= n) {
                result = result * i;
                i++;
            }
            System.out.println("Факториал числа: " + n + " равен " + result);
        }

        // 2
        {
            System.out.println("Введите число до которого будем считать четные: ");
            int n = scanner.nextInt();
            int i = 1;
            while (i <= n) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }

        //3
        {
            System.out.println("Введите положительное число для старта: ");
            int number = scanner.nextInt();
            while (number >= 1) {
                System.out.println(number);
                number--;
            }
        }
    }
}
