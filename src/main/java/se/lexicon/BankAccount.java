package se.lexicon;

public class BankAccount {

    static double interestRate = 5.0;

    // Instance Fields
    String accountHolder;
    double balance;

    // Instance Methods
    public void deposit(double amount) {
        // validate the params
        /*if (amount <=0){
            throw new IllegalArgumentException("");
        }*/
        //balance = balance + amount;
        balance += amount;
    }

    public void withdraw(double amount){
        /*if(amount <= 0){
            System.out.println("Amount should be a positive number");
            //throw new IllegalArgumentException("Amount should be a positive number");
        }
        if (amount > balance){
            System.out.println("Insufficient founds!");
            //throw new IllegalArgumentException("Insufficient founds!");
        }*/
        this.balance -= amount;
    }

    public void displayAccountInfo(){
        System.out.println("Account Holder: " + this.accountHolder + ", Balance: " + this.balance + ", InterestRate: " + BankAccount.interestRate);
    }

    public static double calculateLoanPayment(double amount, int years){
        double totalPayment = amount + (amount * (interestRate / 100) * years);
        return totalPayment;
    }

    /*public static double calculateLoanPaymentForAccount(double amount, int years, BankAccount account){
        double totalPayment = amount + (amount * (interestRate / 100) * years);
        return totalPayment;
    }*/

}
