package oct14_conditions;

import java.util.*;
// 8. Разборчивая невеста при выборе женихов руководствуется правилом: "жених должен быть старше ее, но ненамного". По известным возрастам
// невесты -
// N лет и женихов: R лет, F лет и S лет (все возраста женихов разные и больше возраста невесты), определить, которого она выберет -
// первого, второго или третьего
// Входные данные: На вход программе подается четыре числа, по одному в строке
// в первой строке - возраст невесты
// в следующих трёх - возраста женихов (R, F и S соответственно).
// Выходные данные: вывести букву жениха (R, F или S), которого выберет невеста.
// автор кода Алмас Киличов

public class HW8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int R = input.nextInt();
        int F = input.nextInt();
        int S = input.nextInt();

        if (((R <= F && F <= S) || (R <= S && S <= F)) && N < R) {
            System.out.println("R");
        } else if (((F <= R && R <= S) || (F <= S && S <= R)) && N < F) {
            System.out.println("F");
        } else if (((S <= F && F <= R) || (S <= R && R <= F)) && N < S) {
            System.out.println("S");
        }
    }
}
