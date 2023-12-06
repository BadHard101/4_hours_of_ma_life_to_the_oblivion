package org.example;

import java.util.Arrays;

public class Main5 {
    static int sort(int arr[]) {
        int n = arr.length;

        int gap = 4;
            for (int i = gap; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
                System.out.println(Arrays.toString(arr) );
            }
        return 0;
    }
    public static void main(String[] args) {
        sort(new int[]{2, 5, 7,8,1,9,2,4,6,1,5,4});
    }
}