package lab1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class lab_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        do {
            try {
                System.out.print("Введите количество элементов массива(целое число > 0): ");
                size = scanner.nextInt();

                if (size<=0) {
                    System.out.println("Ошибка! Размер массива должен быть больше 0! ");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите целое число!");
                scanner.next();
            }
        } while (size<=0);

        int[] numbers = new int[size];

        System.out.println("Введите элементы массива: ");
        int i = 0;

        do {
            try {
                numbers[i] = scanner.nextInt();
                i++;
            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите целое число!");
                scanner.next();
            }
        } while (i<size);

        i = 0;
        System.out.print("Ваш массив: ");
        while (i < size) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();


        i=0;
        int sum = 0;
        while (i<size) {
            sum+=numbers[i];
            i++;
        }
        System.out.print("Сумма элементов массива: " + sum);
        System.out.println();

        i=1;
        int max = numbers[0];
        while (i<size) {
            if (numbers[i]>max) {
                max = numbers[i];
            }
            i++;
        }
        System.out.print("Максимальное число: " + max);
        System.out.println();

        i=1;
        int min = numbers[0];
        while (i<size) {
            if (numbers[i]<min) {
                min = numbers[i];
            }
            i++;
        }
        System.out.print("Минимальное число: " + min);
    }
}