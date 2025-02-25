package homeassignments.task4;

import java.util.Scanner;

public class MutlOfTwoFiveBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Введите число c: ");
        int c = in.nextInt();
        if (a%2==0 && a%5==0) System.out.println("Число " + a + " кратно одновременно 2 и 5.");
        if (b%2==0 && b%5==0) System.out.println("Число " + b + " кратно одновременно 2 и 5.");
        if (c%2==0 && c%5==0) System.out.println("Число " + c + " кратно одновременно 2 и 5.");
    }
}