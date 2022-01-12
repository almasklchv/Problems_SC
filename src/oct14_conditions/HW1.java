package oct14_conditions;

import java.util.*;
// 1. С клавиатуры считывается два числа. Если первое число больше второго, то вывести на экран его,
// если нет — то второе число
// автор кода Алмас Киличов

public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }
}
