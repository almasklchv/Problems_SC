package oct14_conditions;

import java.util.*;
// За контрольную работу в классе учениками было получено A - пятерок, B - четверок, C - троек и D - двоек
// Напишите программу, которая определяет сколько учеников получили оценку, превышающую средний балл
// Входные данные: на вход программы подаются 4 числа (A, B, C, D), по одному в строке
// Выходные данные: выведите одно число - сколько учеников получили оценку превышающую средний балл
// автор кода Алмас Киличов

public class HW9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int exceedAverageScore = 0;
        int averageScore = (A*5 + B*4 + C*3 + D*2) / (A + B + C + D);

        if (3 > averageScore) {
            exceedAverageScore += A+B+C;
        } else if (4 > averageScore) {
            exceedAverageScore += A+B;
        } else {
            exceedAverageScore += A;
        }

        System.out.println(exceedAverageScore);
    }
}
