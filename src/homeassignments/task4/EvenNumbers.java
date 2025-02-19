package homeassignments.task4;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите число: ");
            a = in.nextInt();
            if (a%2==0) {
                System.out.println("Число "+a+" чётное.");
            } else {
                System.out.println("Число "+a+" нечётное.");
            }
        }
    }
}