package com.company;

public class Main {

    public static void main(String[] args) {
//        calcFactorial();
        calcEX();


    }


    public static void calcFactorial() {
        for (long i = 1, factorial = 1; i <= 20; i++) {
            factorial *= i;
            System.out.println(factorial);
            /// The number exceeds the number limit for an int type and instead of getting bigger it displays a negative value.
        }
    }

    public static double calcEX() {
        double e = 1.00;
        for (double factorial = 1.00, oldE = 0, i = 1.00, x = 1.00;e - oldE > 0.001 ; x = x + 1) {
            if (x<=5) {
                factorial *= i;
                oldE = e;
                e += Math.pow(x, i) / factorial;
                i = i + 1;
            }
        }
        System.out.printf("e is %2.3f \n", e);
        return e;
    }
}

