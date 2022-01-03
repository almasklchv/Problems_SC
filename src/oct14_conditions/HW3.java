package oct14_conditions;

import java.util.*;
// 3. Даны два целых числа a и b. Меньшее из двух чисел удвоить, а большее - утроить.

public class HW3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a < b) {
            a *= 2;
            b *= 3;
        } else {
            a *= 3;
            b *= 2;
        }

        System.out.println(a + " " + b);
    }
}
