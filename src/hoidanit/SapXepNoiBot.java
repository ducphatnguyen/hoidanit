package hoidanit;

import java.util.Arrays;

public class SapXepNoiBot {
    public static void main(String[] args) {
        int[] a = { 10, 5, 20, 30, 1, 3, 69, 12, 2 };
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("a = " + Arrays.toString(a));
    }
}
