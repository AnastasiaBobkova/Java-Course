package homeassignments.task4;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Введите число x.\nПримечание: х не должно быть равным нулю.\nx = ");
            x = in.nextInt();
        } while (x==0);

        int result = 15/x;

        switch(result) {
            case(3):
                System.out.println("Результат деления равен 3.");
                break;
            case(5):
                System.out.println("Результат деления равен 5.");
                break;
            case(1):
                System.out.println("Результат деления равен 1.");
                break;
            case(15):
                System.out.println("Результат деления равен 15.");
                break;
            default:
                System.out.println("Результат деления равен дробному числу " + (double)15/(double)x);
        }
    }
}