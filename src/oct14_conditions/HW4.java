package oct14_conditions;

import java.util.*;
// 4. Дано трехзначное число. Определить и вывести на экран, какая из его цифр больше

public class HW4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number % 10 > number / 100 && number % 10 > number / 10 % 10) {
            System.out.println(number % 10);
        } else if (number / 100 > number % 10 && number / 100 > number / 10 % 10) {
            System.out.println(number / 100);
        } else {
            System.out.println(number/10%10);
        }
    }
}
