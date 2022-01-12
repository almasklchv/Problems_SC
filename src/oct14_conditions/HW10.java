package oct14_conditions;

import java.util.*;
// Дано целое число minutes, в котором хранится любое количество минут (от 0 до 1439).
// Вывести на экран точное время в формате часы:минуты (12:00), а так же если часы попали
// в диапазон от 09:00 до 18:00 - вывести "working time", в противном случае вывести "free time".
// В случае, если кол-во часов или минут меньше 10, поставить перед ним нолик. Т.е. 15:5 - неправильно, 15:05 - правильно. Примеры:
// (minutes = 855). Вывод на экране: 14:15 - working time
// (minutes = 485). Вывод на экране: 08:05 - free time
// автор кода Алмас Киличов

public class HW10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutes = -1;
        String time;

        while (!(minutes >= 0 && minutes <= 1439)) {
            System.out.print("Введите количество минут (0-1439): ");
            minutes = input.nextInt();
        }

        int hours = 0;
        while (minutes > 60) {
            minutes -= 60;
            hours += 1;
        }

        if (hours < 10 && minutes < 10) {
            time = "0" + hours + ":0" + minutes;
        } else if (hours < 10) {
            time = "0" + hours + ":" + minutes;
        } else if (minutes < 10) {
            time = hours + ":0" + minutes;
        } else {
            time = hours + ":" + minutes;
        }

        boolean isWorkingTime = hours >= 9 && hours <= 18;

        System.out.println(time);
        if (isWorkingTime) {
            System.out.println("working time");
        } else {
            System.out.println("free time");
        }
    }
}