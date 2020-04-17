package com.itaccademy;

import java.util.Arrays;

/**
 * Заданы 2 массива целых чисел произвольной длины. 
 *     Написать программу, создающую третий массив,
 * представляющий собой слияние 2-х заданных.
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
public class Union {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 6, 7};
        int[] c = new int[a.length + b.length];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        unionArrays(c, a, b);
    }

    public static void unionArrays(int[] c, int[] a, int[] b) {
        int interlend = b.length;
        int alen = a.length - b.length;
        for (int i = 0; i < interlend; i++) {
            c[i * 2] = a[i];
            c[i * 2 + 1] = b[i];
        }
        for (int i = 0; i < alen; i++) {
            c[interlend * 2 + i] = a[i + interlend];

        }
        System.out.println(Arrays.toString(c));

    }

}



