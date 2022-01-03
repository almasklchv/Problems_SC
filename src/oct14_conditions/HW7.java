package oct14_conditions;

import java.util.*;
// 7. Напишите программу, которая моделирует работу следующего автомата. Автомат получает на вход трехзначное число и строит
// новое число следующим образом:
// 1) вычисляются суммы первой и второй, затем - второй и третьей цифр;
// 2) эти суммы записываются в порядке невозрастания.
// Например, для числа 639 получаем суммы: 6 + 3 = 9; 3 + 9 = 12. Результат: 129

public class HW7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sumOfFirstAndTwo = number / 100 + number / 10 % 10;
        int sumOfTwoAndThree = number / 10 % 10 + number % 10;

        if (sumOfFirstAndTwo >= sumOfTwoAndThree) {
            System.out.println(sumOfFirstAndTwo + "" + sumOfTwoAndThree);
        } else {
            System.out.println(sumOfTwoAndThree + "" + sumOfFirstAndTwo);
        }
    }
}
