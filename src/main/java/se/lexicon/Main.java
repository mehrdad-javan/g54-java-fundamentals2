package se.lexicon;

public class Main {
    public static void main(String[] args) {
        System.out.println(MathOperations.add(10, 10));
        PaymentProcessor.processPayment("1234-5678-9012-3456", "123", 150.0);
    }
}