package IfElse;

import java.util.Scanner;

public class TaskIfElse {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        // 1
        int number = scanner.nextInt();

        System.out.println(signNumber(number));

        // 2
        System.out.println("Введите 2 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = findingLargestTwoNumbers(a, b);
        System.out.println(result);

        // 3
        System.out.println("Введите число от 1 до 5: ");
        int score = scanner.nextInt();
        System.out.println(derivingRating(score));

        // 4
        System.out.println("Проверьте число на четность: ");
        int numberInput = scanner.nextInt();
        System.out.println(parityInput(numberInput));

        // 5
        System.out.println("Введите возраст: ");
        int numberAge = scanner.nextInt();
        System.out.println(discountAmount(numberAge));

        // 6
        System.out.println("Количество баллов: ");
        int numberPoints = scanner.nextInt();
        System.out.println(resultEvaluation(numberPoints));
    }



    // 1
    public static String signNumber(int i){
        if (i > 0 ) {
            return "Число положительное";
        } else if ( i < 0) {
            return "Число отрицательное";
        } else {
            return "Число равно 0";
        }
    }

    // 2
    public static int findingLargestTwoNumbers(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // 3
    public static String derivingRating(int score) {
        switch (score) {
            case 5: return "Отлично";
            case 4: return "Хорошо";
            case 3: return "Удовлетворительно";
            case 2:
            case 1: return "Неудовлетворительно";
            default: return "Ошибка";
        }
    }

    // 4
    public static String parityInput(int number) {
        if (number % 2 == 0) {
            return "Четное";
        } else {
            return "Нечетное";
        }
    }

    // 5
    public static String discountAmount(int age){
        if (age <= 18) {
            return "25%";
        } else if (age >= 65) {
            return "30%";
        } else {
            return "Без скидки";
        }
    }

    // 6
    public static String resultEvaluation(int result){
        if (result >= 90){
            return "Great";
        } if (result >= 75) {
            return "Good";
        } if (result >= 60) {
            return "Satisfactorily";
        } else {
            return "Unsatisfactory";
        }
    }
}
