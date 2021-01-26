package com.company;

public class TestMethods {
    public static String method1(String x) {
        String a = "";
        for(int i = 5; i>=0; i--){
            char ch = x.charAt(i);
            a+= ch;
        }
        return x + a;
    }

//    public static boolean yinYan(String a){
//
//    }

    public static void main(String [] args){
        System.out.println(method1("Peanut"));
        System.out.println(method1("stapler"));
    }
}

