package org.example;

public class App {

    // CRITICAL SECURITY ISSUE (will trigger vulnerability)
    private static final String PASSWORD = "admin123";

    public static void main(String[] args) {

        // CRITICAL BUG (division by zero)
        int result = 10 / 0;

        try {
            System.out.println("Testing SonarQube");
        } catch (Exception e) {
            // EMPTY CATCH (code smell)
        }

        System.out.println("Password is: " + PASSWORD);
    }
}
