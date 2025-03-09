package homeassignments.task6;

import java.util.Scanner;

public class SecondArrayTask {
    public static void main(String[] args) {
        int arraySize = 5;
        int [] array = new int[arraySize];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите " + i + "-й элемент массива: ");
            array[i] = in.nextInt();
        }
        System.out.println("Исходный массив: ");
        printArray(array);
        int [] newArray = new int[arraySize+1];
        for (int i = 0; i <= arraySize; i++) {
            if (i==arraySize) {
                newArray[i] = 0;
            } else {
                newArray[i] = array[i];
            }
        }
        System.out.println("\nНовый массив: ");
        printArray(newArray);
    }

    static void printArray(int[] arrayForPrint) {
        for(int element:arrayForPrint){
            System.out.print(element + " |");
        }
    }
}