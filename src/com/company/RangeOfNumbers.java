package com.company;

import java.util.Scanner;

public class RangeOfNumbers {
    public RangeOfNumbers() {
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner e = new Scanner(System.in);
        System.out.println("Give me a number");
        int start = s.nextInt();
        System.out.println("Give me another number");
        int end = e.nextInt();
        if (start < end) {
                for (int i = start; i < end; i++) {
                    System.out.print(i);
                for (int p = 1; p <= 1; p++) {
                    System.out.print(", ");
                }
            }
            System.out.print(end);
        }

        if (start > end) {
            for (int m = start; m > end; m--) {
                System.out.print(m);
                for (int p = 1; p <= 1; p++) {
                    System.out.print(", ");
                }
            }
            System.out.print(end);
        }
            if (start == end) {
                System.out.print(start);
            }
    }
}



