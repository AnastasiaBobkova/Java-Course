package homeassignments.task6;

import java.util.Scanner;

public class ThirdArrayTask {
    public static int[] inputArray (int arraySize) {
        int [] array = new int[arraySize];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите " + i + "-й элемент массива: ");
            array[i] = in.nextInt();
        }
        return array;
    }
    public static void printArray(int[] arrayForPrint) {
        for(int element:arrayForPrint){
            System.out.print(element + " |");
        }
    }
    public static int maxElement(int [] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int minElement(int [] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void changeMinMaxElement(int [] arrayToChange, int min, int max) {
        for (int i = 0; i < arrayToChange.length; i++) {
            if (arrayToChange[i] == max) {
                arrayToChange[i] = 1000;
            }
            if (arrayToChange[i] == min) {
                arrayToChange[i] = -1000;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввведите размер массива: ");
        int arraySize = in.nextInt();
        int [] array = inputArray(arraySize);
        System.out.println("Исходный массив: ");
        printArray(array);
        int minElement = minElement(array);
        System.out.println("\nМинимальный элемент массива: " + minElement);
        int maxElement = maxElement(array);
        System.out.println("Максимальный элемент массива: " + maxElement);
        changeMinMaxElement(array, minElement, maxElement);
        System.out.println("Новый массив: ");
        printArray(array);
    }
}