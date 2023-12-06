package org.example;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] x = {2,7,6,1,9,5,8,3,4,0};
        int k = 0;
        for (int i = 0; i < 10; i++) {
            if (x[i] % 2 == 0) System.out.println(i + " ");
        }
    }
}