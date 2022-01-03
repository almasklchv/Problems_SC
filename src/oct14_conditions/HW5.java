package oct14_conditions;

import java.util.*;
// 5. Если целое число m делится нацело на целое число n, то вывести на экран частное от целочисленного деления m на n,
// в противном случае вывести сообщение "not completely divisible"

public class HW5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();

        if (m % n == 0) {
            System.out.println(m / n);
        } else {
            System.out.println("not completely divisible");        }
    }
}
