package homeassignments.task5;

import java.util.Scanner;

public class SumOfNumInterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        do {
            System.out.print("Введите число a: ");
            a = in.nextInt();
        } while (a < 0);
        int b;
        do {
            System.out.print("Введите число b(b не должно быть больше a): ");
            b = in.nextInt();
        } while (b < 0 || b < a);
        int sum = 0;
        while (a <= b) {
            sum+=a;
            a++;
        }
        System.out.println("Сумма чисел в диапазоне от a до b равна " + sum);
    }
}