package org.example;

public class Main8 {
    public static void main(String[] args) {
        int a = 1819;
        int b = a / 100 *10 +9;
        a = (10*b - a) % 100;
        System.out.println(a + " " + b);
    }
}