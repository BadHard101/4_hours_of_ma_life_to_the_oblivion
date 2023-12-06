package org.example;

public class Main9 {
    public static void main(String[] args) {
        int[] a = {0, 5, 6, 1, 3, 4, 7, 2};
        int i = 1;
        int c = 0;
        int j;
        for (int aa = 0; aa < 100; aa++) {

            j = a[i];
            a[i] = i;
            i=j;
            c+=i;
        }
        System.out.println(c);
    }
}