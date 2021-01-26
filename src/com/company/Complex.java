package com.company;

public class Complex {
    private double a;
    private double b;

    public Complex(double newA, double newB){
        a = newA;
        b = newB;
    }
    public Complex(double newA){
        this(newA, 0.0 );
    }
    public Complex add(Complex other){
        double newA = this.a + other.a;
        double newB = this.b + other.b;
        return new Complex(newA, newB);
    }
    public double abs(){
        double newA = Math.pow(this.a, 2);
        double newB = Math.pow(this.b, 2);
        return Math.sqrt(newA + newB);
    }
    public Complex multiply(Complex other){
        double newA = this.a * other.a + (-1 * (this.b * other.b));
        double newB = this.b * other.a + this.a * other.b;
        return new Complex(newA, newB);

    }
    public Complex multiply(double a) {
        double newA = this.a * a;
        double newB = this.b * a;
        return new Complex(newA, newB);
    }
    public Complex add(double c){
        double newA = this.a  + c;
        double newB = this.b;
        return new Complex(newA, newB);
    }
    public String toString(){
        String c = b + "i";
         return a + " + " + c;

    }    public static void main(String[] args){
        Complex num1 = new Complex(-4, 5);
        Complex num2 = new Complex(5,-6);
        Complex num3 = new Complex(-7, 0.0);
        Complex num4 = new Complex(0.0, -10);
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.abs());
        System.out.println(num2.abs());
        System.out.println(num3.add(num4));
        System.out.println(num3.multiply(num1));
        System.out.println(num3.multiply(num2));
        System.out.println(num4.multiply(num1));
        System.out.println(num4.multiply(num2));

//        System.out.println(num4.add(num5));
//        System.out.println(num2.add(num3));


    }
}
