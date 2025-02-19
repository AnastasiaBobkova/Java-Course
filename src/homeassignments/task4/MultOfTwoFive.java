package homeassignments.task4;

import java.util.Scanner;

public class MultOfTwoFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = 3;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите число: ");
            array[i] = in.nextInt();
        }
        for (int i = 0; i < arraySize; i++) {
            if (array[i]%2==0 && array[i]%5==0) {
                System.out.println("Число " + array[i] + " кратно 2 и 5 одновременно.");
            }
        }
    }
}