package oct14_conditions;

import java.util.*;
// С клавиатуры считываются три числа day, month, year, которые вместе представляют какую-то дату.
// Определить, возможна ли такая дата, если да - вывести true, если нет - false.
// Учесть високосность года (в нем в феврале 29 дней, но високосный год это не только тот, который делится на 4),
// и учесть разное кол-во дней в месяцах
// автор кода Алмас Киличов


public class HW11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();

        boolean is30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean isVysokosniy = year % 4 == 0;

        if (is30 && (day >= 1 && day <= 30)) {
            System.out.println(true);
        } else if (month == 2 && isVysokosniy && (day >= 1 && day <= 29)) {
            System.out.println(true);
        } else if (month == 2 && !isVysokosniy && (day >= 1 && day <= 28)) {
            System.out.println(true);
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && (day >= 1 && day <= 31)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
