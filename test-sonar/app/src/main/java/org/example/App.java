package com.example;

public class MainActivity {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }

        System.out.println("Hello Clean Code");
    }
}
