package homeassignments.task5;

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        do {
            System.out.print("Введите число, которое не заканчивается на ноль: ");
            a = in.nextInt();
        } while (a%10 == 0);
        while (a>0) {
            int digit = a%10;
            if (digit%2 == 0) {
                System.out.println(digit + " чётное.");
            } else {
                System.out.println(digit + " нечётное.");
            }
            a /= 10;
        }
    }
}