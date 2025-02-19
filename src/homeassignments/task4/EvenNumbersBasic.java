package homeassignments.task4;

import java.util.Scanner;

public class EvenNumbersBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = in.nextInt();
        System.out.println("Введите число b: ");
        int b = in.nextInt();
        System.out.println("Введите число c: ");
        int c = in.nextInt();
        System.out.println("Чётные числа, среди введённых:");
        if (a%2==0) System.out.println(a);
        if (b%2==0) System.out.println(b);
        if (c%2==0) System.out.println(c);
    }
}