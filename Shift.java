package com.itaccademy;

import java.util.Arrays;

public class Shift {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
        System.out.println();
        shiftRight(a);

    }

    public static void shiftRight(int[] a) {

        int size = a.length;
        for (int i = 0; i < size + 1; i++) {
            int temp = a[size - 1];
            for (int j = size - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }
        System.out.print(Arrays.toString(a));
    }
}