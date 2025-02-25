package homeassignments.task6;

import java.util.Scanner;

public class FourthArrayTask {
    public static int[] inputArray (int arraySize) {
        int [] array = new int[arraySize];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите " + i + "-й элемент массива: ");
            array[i] = in.nextInt();
        }
        return array;
    }
    public static void sortArray(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = arrayToSort.length - 1; j > i ; j--) {
                if (arrayToSort[j] < arrayToSort[j -1]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j-1];
                    arrayToSort[j-1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arrayForPrint) {
        for(int element:arrayForPrint){
            System.out.print(element + " |");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввведите размер массива: ");
        int arraySize = in.nextInt();
        int [] array = inputArray(arraySize);
        System.out.println("Исходный массив: ");
        printArray(array);
        sortArray(array);
        System.out.println("\nОтсортированный по возрастанию массив: ");
        printArray(array);
    }
}