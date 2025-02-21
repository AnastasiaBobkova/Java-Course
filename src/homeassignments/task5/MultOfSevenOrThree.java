package homeassignments.task5;

import java.util.Scanner;

public class MultOfSevenOrThree {
    public static void main(String[] args) {
        System.out.println("Числа кратные 3 или 7 в диапазоне от 1 до 100:");
        for (int i = 1; i <= 100; i++) {
            if (i%3==0 || i%7==0) System.out.print(i + "| ");
        }
    }
}
