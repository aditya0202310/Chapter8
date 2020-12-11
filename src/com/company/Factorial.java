package com.company;

public class Factorial {
    public Factorial() {
    }

    public static long calcFactorial(int f) {
        int i = 2;
        long factorial = 1;
        while (f >= i) {
            factorial *= i;
            i = i + 1;
        }
        return factorial;
    }

    public static void calcE() {
        double e = 1.00;
        double factorial = 1.00;
        double olde = 0;
        double i = 1;
        while (e - olde > 0.001) {
            factorial *= i;
            olde = e;
            i = i + 1;
            e += 1 / factorial;
            System.out.println(e);
        }
        System.out.printf("e is %2.3f \n", e);
        ;
    }

    public static void calcEX(int x) {
        double e = 1.00;
        double factorial = 1.00;
        double oldE = 0;
        double i = 1;
        while (e - oldE > 0.001) {
            factorial *= i;
            oldE = e;
            e += Math.pow(x, i) / factorial;
            i = i + 1;
            System.out.println(e);
        }
        System.out.printf("e is %2.3f \n", e);
    }

    public static void main(String[] args) {
        for (long i = 1, factorial = 1; i <= 20; i++) {
            factorial *= i;
            System.out.println(factorial);
        }
        long e = 1;
        for (long factorial = 1, oldE = 0, i = 1, x = 1; e - oldE > 0.001; x = x + 1) {
            if (x <= 5) {
                factorial *= i;
                oldE = e;
                e += Math.pow(x, i) / factorial;
                i = i + 1;
            }
        }
        System.out.printf("e is %2.3f \n", e);
    }
    void calcFactorial();
//        System.out.println(calcFactorial(8));
//        System.out.println(calcFactorial(10));
//          calcE();
//        calcEX(1);
//        calcEX(2);
//        calcEX(3);
//        calcEX(4);
//        calcEX(5);

}
