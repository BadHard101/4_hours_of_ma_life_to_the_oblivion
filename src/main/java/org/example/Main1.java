package org.example;

public class Main1 {
    public static void main(String[] args) {
        double n = 31;
        double xs = 1;
        double x = 0;
        double y;
        while (Math.abs(x-xs)>0.00000001) {
            xs=x;
            y=0.57/n;
            x=3.2*Math.sin(y)/(4*(1-y)*(4-(1+y)*(1+y))-12);
            n+=0.7;
        }
        System.out.println(x);
    }
}