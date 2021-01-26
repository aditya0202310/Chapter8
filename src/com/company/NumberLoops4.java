package com.company;

public class NumberLoops4 {
    private static final int SIZE = 7;
    public static void main(String[] args) {
        for (int i = 1; i <= SIZE; i++) {
            for (int j = 1; j <= SIZE - i; j++) {
                System.out.print(".");
            }
            System.out.print(i);
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}