package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 50;
        int[][] a = new int[99][99];
        int k;
        for (int j = n; j >= 0; j--) {
            k = j;
            for (int i = n; i >= 0; i--) {
                if (n-i+1<=j) {
                    a[i][j] = k;
                    k++;
                } else {
                    a[i][j] = 0;
                }
            }
        }
        int j = 20;
        int s = 0;
        for (int i = 0; i < n+1; i++) {
            s = s+a[i][j];
        }
        System.out.println(s);
    }
}