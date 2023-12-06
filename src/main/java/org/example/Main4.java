package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int[] a = {2,4,3,1,1};
        int[] b = {7,4,4,2,5};
        int k = 11113;
        for (int kk = 0; kk < k; kk++) {
            int j = 1;
            int i = 0;
            while (j==1 && i<5) {
                i+=1;
                a[i] +=1;
                if (a[i]<=b[i]) j =0;
                else a[i] = 0;
            }

        }
        System.out.println(Arrays.toString(a));
    }
}