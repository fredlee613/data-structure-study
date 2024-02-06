package ch01;

import java.io.*;

public class Q02 {
    static int[] arr = new int[4];
    static int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    static void recursive(int L, int k) {
        if (L == 4) {
            System.out.println("max(" + arr[1] + ", " + arr[2] + ", " + arr[3] + ") = " + getMax(arr[1], arr[2], arr[3]));
            return;
        }
        for (int i = k; i <= 3; i++) {
            arr[L] = i;
            recursive(L + 1, i);
        }
    }

    public static void main(String[] args) throws IOException {
        recursive(1, 1);
    }
}
