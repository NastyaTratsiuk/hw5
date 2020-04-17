package com.itaccademy;

import java.util.Arrays;

/**
 * Написать программу, удаляющую все повторяющиеся целые
 * числа из массива и печатающую результат. Массив должен
 * использоваться тот же самый. На место удаленных элементов
 * ставить цифру 0.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 5, 5, 6, 1, 1};
        System.out.print(Arrays.toString(a));
        System.out.println();
        changeNumbers(a);

    }

    public static void changeNumbers(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}



