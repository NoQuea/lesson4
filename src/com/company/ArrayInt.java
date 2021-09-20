package com.company;

import java.util.Arrays;

public class ArrayInt {

    public static void main(String[] args) {
        sort();
        maxInt();
        indexInt();
    }

    private static void indexInt() {
        int[] array = {1, 3, 5, 6, 7, 0, 10, 2};
        Arrays.sort(array);
        int index = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Индекс максимального числа равен = "+index);
    }

    private static void maxInt() {
        int[] array = {1, 3, 5, 6, 7, 0, 10, 2};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число равно = "+max);
    }


    private static void sort() {
        int[] array = {1, 3, 5, 6, 7, 0, 10, 2};
        Arrays.sort(array);
        System.out.println("Сортировка = "+Arrays.toString(array));
    }

}
