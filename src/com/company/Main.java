package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // prints one asterisk
        System.out.println("Prints one asterisk");
        printOneAsterisk();

        // Given a number n, print n asterisks on one line
        System.out.println("Drawing a horizontal line with n = 3");
	    drawHorizontalLine(3);

	    // Given a number n, print n lines, each with one asterisks
        System.out.println("Drawing a vertical line with n = 3");
        drawVerticalLine(3);

        // Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line,
        // two on the second,etc.)
        System.out.println("Drawing a triangle with n = 3");
        drawRightTriangle(3);

        // Given a number n, print a centered triangle
        System.out.println("Drawing an Isosceles Triangle with n = 3");
        drawIsoscelesTriangle(3);

        // Given a number n, print a centered diamond
        System.out.println("Drawing a Diamond with n = 3");
        drawDiamond(3);

        // Given a number n, print a centered diamond with your name in place of the middle line
        System.out.println("Drawing a Diamond with a name with n = 3");
        drawDiamondWithAName(3, "Bob");

        // FizzBuzz() for numbers 1-100
        System.out.println("FizzBuzz for n = 100");
        fizzBuzz(100);

        // Prints a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order
        System.out.println("Generates prime factors where n = 30");
        generate(100);
    }

    private static void generate(int n) {
        String result = "";
        for(int i = 2; i <= n; i++){
            while(n%i == 0){
                result += i + ",";
                n = n/i;
            }
        }
        System.out.println(result.substring(0,result.length() - 1)); // ignores the ending comma
    }

    private static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static void drawDiamondWithAName(int n, String name) {
        for (int i = 0; i < n-1; i++) {
            printNCharacters(n - (i+1), " ");
            printNCharacters(i*2+1, "*");
            System.out.print("\n");
        }
        System.out.println(name);
        for (int i = n-2; i >= 0; i--) {
            printNCharacters(n - (i+1), " ");
            printNCharacters(i*2+1, "*");
            System.out.print("\n");
        }
    }

    private static void drawDiamond(int n) {
        drawIsoscelesTriangle(n);
        for (int i = n-2; i >= 0; i--) {
            printNCharacters(n - (i+1), " ");
            printNCharacters(i*2+1, "*");
            System.out.print("\n");
        }
    }

    private static void drawIsoscelesTriangle(int n) {
        for (int i = 0; i < n; i++) {
            printNCharacters(n - (i+1), " ");
            printNCharacters(i*2+1, "*");
            System.out.print("\n");
        }
    }

    private static void printNCharacters(int n, String character) {
        for (int i = 0; i < n; i++) {
            System.out.print(character);
        }
    }

    private static void drawRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private static void drawVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*\n");
        }
    }

    private static void printOneAsterisk() {
        System.out.print("*\n");
    }

    private static void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
