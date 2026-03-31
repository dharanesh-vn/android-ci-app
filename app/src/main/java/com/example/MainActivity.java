public void insecureMethod() {
    String apiKey = "1234567890SECRET"; // Hardcoded secret (Vulnerability)

    try {
        int x = 10 / 0; // Runtime issue
    } catch (Exception e) {
        // Empty catch block (Code smell)
    }
}
