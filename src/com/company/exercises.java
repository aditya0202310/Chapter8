package com.company;

public class exercises {

    public static void exercises() {
    }
// first method
    public static String addOdds(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
          sum += i;
          i = i + 2;
        }
        return "Sum of odd numbers from 1 to n is " + sum;
    }
    // Second method
    public static String howManyYears(double endPop) {
        int year = 0;
        double startPop = 111.2;
        while(startPop <= endPop){
            startPop = startPop * 1.0113;
           year++;
        }
        return "It will take " + year + " years for the start population to equal end population";
    }
    // Third method
    public static void printSum(int n){
        int i = 1;
        int sum = 0;
        while (i <= n){
            System.out.print(i + " ");
            sum += i;
            i = i + 1;
        }
        System.out.println("= " + sum);

    }
    //Fourth Method
    public static boolean PerfectSquare(int n){
        int i = 1;
        int sum = 0;
        while (sum <= n){
           sum += i;
           i = i + 2;
            if(sum == n ) {
                System.out.println("Fantastic it's a perfect square!");
                return true;
            }

        }
        System.out.println("It's not a perfect square. Try again.");
        return false;
     //Fifth Method
    }
    public static int sumDigits(int k){
        int sum = 0;
        int lastDigit = 0;
        while(k > 0){
            lastDigit = k % 10;
            sum += lastDigit;
            k = k/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addOdds(10));
        System.out.println(addOdds(20));
        System.out.println(addOdds(150));
        System.out.println(howManyYears(120));
        System.out.println(howManyYears(150));
        printSum(6);
        printSum(8);
        System.out.println(PerfectSquare(4));
        System.out.println(PerfectSquare(25));
        System.out.println(PerfectSquare(49));
        System.out.println(PerfectSquare(34));
        System.out.println(PerfectSquare(29));
        System.out.println(sumDigits(3568));
        System.out.println(sumDigits(929381339));
        System.out.println(sumDigits(9946783));

    }

}
