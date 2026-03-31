package com.example;

public class MainActivity {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public void badCode() {

        // 🔴 Vulnerability
        String password = "admin123";

        // 🔴 Code smell
        try {
            int x = 10 / 0;
        } catch (Exception e) {
        }

        // 🔴 Bug
        String s = null;
        s.length();
    }
}
