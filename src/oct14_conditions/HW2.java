package oct14_conditions;

import java.util.*;
// 2. Написать программу, которая выводит на экран знак "-" (минус), если число, введенное с клавиатуры отрицательное,
// и знак "+" (плюс) - если число положительное (не учитывать, что с клавиатуры может быть введен ноль)
// автор кода Алмас Киличов

public class HW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("-");
        } else {
            System.out.println("+");
        }
    }
}
