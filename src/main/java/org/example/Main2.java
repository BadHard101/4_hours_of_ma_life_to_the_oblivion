package org.example;

public class Main2 {
    public static void main(String[] args) {
        int m = 3;
        int[] x = {6,9,2,3,7,7,6,11,8,5};
        int k;
        for (int j = 1; j <= m; j++) {
            k = x[10-1];
            int i = 9;
            while (i>=1) {
                x[i] = x[i-1];
                i--;
            }
            x[1-1] =k;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(x[i]);
        }
    }
}