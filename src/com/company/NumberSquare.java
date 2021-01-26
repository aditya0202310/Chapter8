package com.company;

import java.util.Scanner;
public class NumberSquare {
    public void NumberSpace() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        System.out.println("give me a number");
        int min = s.nextInt();
        System.out.println("Give me another number");
        int max = t.nextInt();
        int i,j,k;
        for(i=min;i<=max;i++) {
            for(j=i;j<=max;j++) {
                System.out.print(j);
            }
            for(k=min;k<i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

//public class NumberSquare {
//    public void NumberSpace() {
//    }
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        Scanner t = new Scanner(System.in);
//        System.out.println("give me a number");
//        int min = s.nextInt();
//        System.out.println("Give me another number");
//        int max = t.nextInt();
//        System.out.print(min);
//        for (int i = min + 1; i <= max; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
//        System.out.print(min + 1);
//        for (int m = min + 2; m <= max; m++){
//            System.out.print(m);
//        }
//        System.out.print(min);
//        System.out.println();
//        System.out.print(min + 2);
//        for(int k = min + 3; k <= max; k++){
//            System.out.print(k);
//        }
//        System.out.print(min);
//        System.out.print(min + 1);
//        System.out.println();
//        System.out.print(min + 3);
//        for(int l = min + 4; l <= max; l++){
//            System.out.print(l);
//        }
//        System.out.print(min);
//        System.out.print(min + 1);
//        System.out.print(min + 2);
//        System.out.println();
//        System.out.print(min + 4);
//        for(int a = min; a < max;a++){
//            System.out.print(a);
//        }


//            for (int m = 1; m <= max; m++) {
//                System.out.print(m);
//            }
//        }
//        System.out.println();
//        for (int l = 2; l <= max; l++) {
//            System.out.print(l);
//        }
//        System.out.print(min);
//        System.out.println();
//        for(int k = 3; k<=max; k++){
//            System.out.print(k);
//        }
//        System.out.print(min);
//        System.out.print(min + 1);
//        System.out.println();
//        for(int q = 4; q<= max; q++){
//            System.out.print(q);
//        }
//        System.out.print(min);
//        System.out.print(min + 1);
//        System.out.print(min + 2 );
//        System.out.println();
//        for(int p = 5; p<=max; p++){
//            System.out.print(p);
//        }
//        System.out.print(min);
//        System.out.print(min + 1);
//        System.out.print(min + 2 );
//        System.out.print(min + 3);
//        System.out.println();

//    }
//}

