package com.rus;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] mas = {0, 3, 3, 3, 100, 3, 3, 3, 9, 0, 5 , 5, 321, 532 , 12313, 12 , 432};
        System.out.println(Arrays.toString(method(mas)));
        System.out.println("O(n^2 + n)");
    }

    public static int[] method(int[] mas) {
        int n = mas.length;
        for (int i = 0, m ; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (mas[j] != mas[i]) {
                    mas[m] = mas[j];
                    m++;
                }
            }
        }
        if (n != mas.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = mas[i];
            }
            return b;
        }
        return mas;
    }
}
