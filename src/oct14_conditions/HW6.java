package oct14_conditions;

import java.util.*;
// 6. Дано двузначное число n и число a. Определить:
// а) является ли сумма цифр числа n двузначным числом (вывести YES или NO в первой строке);
// б) больше ли сумма цифр введенного числа n чем число a (вывести YES или NO во второй строке)

public class HW6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();

        if ((n % 10 + n / 10) >= 10 && (n % 10 + n / 10) <= 99) { // а)
            System.out.println("а) YES");
        } else {
            System.out.println("а) NO");
        }

        if ((n % 10 + n / 10) > a) {
            System.out.println("б) YES");
        } else {
            System.out.println("б) NO");
        }
    }
}
