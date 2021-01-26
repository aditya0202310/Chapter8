package com.company;

public class Main {

    public Main() {
    }

    //    public static void  floydsTriangle(int k) {
//        for (int i = 0; i <= k; i++) {
//            for (int m = 1; m <=i; m++) {
//                System.out.print(i + 1);
//            }
//            System.out.println();
//        }
//    }
    public static void floydsTriangle(int k) {
        int number = 1;
        for (int i = 1; i <= k; i++) {
            for (int m = 1; m <= i; m++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        floydsTriangle(5);

//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j < 10; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//////        }
//        for (int i = 1; i <= 5; i++) {
//            for (int h = 4; h >= i; h--) {
//                System.out.print(".");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print(i);
//            }
//            System.out.println();


    }
}