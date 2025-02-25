package homeassignments.task5;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        do {
            System.out.print("Введите число, которое не заканчивается на ноль: ");
            a = in.nextInt();
        } while (a%10 == 0);
        System.out.print("Введённое число в обратном порядке: ");
        while (a>0) {
            System.out.print(a%10);
            a /= 10;
        }
    }
}