package homeassignments.task6;

import java.util.Random;

public class FirstArrayTask {

    static void printArray(int[] arrayForPrint) {
        for(int element:arrayForPrint){
            System.out.print(element + " |");
        }
    }

    public static void main(String[] args) {
        int arraySize = 10;
        int [] array = new int[arraySize];
        Random randomNumber = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = randomNumber.nextInt(10);
        }
        System.out.println("Исходный массив:");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (i%2!=0) array[i]=0;
        }
        System.out.println("\nНовый массив:");
        printArray(array);
    }
}