package se.lexicon;

public class PaymentProcessor {

    // For credit card payment
    public static void processPayment(String cardNumber, String cvv, double amount){
        System.out.println("Processing credit card payment...");
    }

    public static void processPayment(String bankAccount, String swiftCode, double amount, String currency){
        System.out.println("Processing bank transfer...");
    }

    // add more methods as needed
}
