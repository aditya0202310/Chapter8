package com.company;

public class AsciiFigure{
    public static final int SIZE = 5; // number of lines
    public static final int STAR_INCREMENT = 8; // stars added/line

    public static void main (String [] args) {
        int maxLineWidth = STAR_INCREMENT * (SIZE - 1);
        for (int line = 0; line < SIZE; line++) {
            int numStarsOnLine = STAR_INCREMENT * line;
            int numSlashes = (maxLineWidth - numStarsOnLine) / 2;
            for (int i = 0; i < numSlashes; i++) {
                System.out.print("/");
            }
            for (int i = 0; i < numStarsOnLine; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < numSlashes; i++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

}

