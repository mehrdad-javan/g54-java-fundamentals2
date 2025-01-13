package se.lexicon;

public class Main {
    public static void main(String[] args) {

        // Create BankAccount object (instance)
        BankAccount account1 = new BankAccount();
        // Initialize fields for account1
        account1.accountHolder = "Mehrdad";
        account1.balance = 100.00;

        // Create BankAccount object (instance)
        BankAccount account2 = new BankAccount();
        // Initialize fields for account2
        account2.accountHolder = "Marcus";
        account2.balance = 200.00;

        BankAccount.interestRate = 6.8;

        account1.displayAccountInfo();
        account2.displayAccountInfo();

        account1.deposit(300.00);
        account1.withdraw(250.00);
        account1.displayAccountInfo();

        System.out.println("Total Loan Repayment Amount: " + BankAccount.calculateLoanPayment(10000, 2));


        /*String accountHolder1 = "Mehrdad";
        double balance1 = 100.00;

        String accountHolder2 = "Marcus";
        double balance2 = 200.00;


        System.out.println("Account Info:");
        System.out.println("accountHolder1 = " + accountHolder1);
        System.out.println("balance1 = " + balance1);


        System.out.println("Account Info:");
        System.out.println("accountHolder2 = " + accountHolder2);
        System.out.println("balance2 = " + balance2);

        balance1 = balance1 + 20.00; // deposit
        balance2 = balance2 + 100.00; // deposit
        balance1 = balance1 - 20.00; // withdraw

        System.out.println("Account Info:");
        System.out.println("accountHolder1 = " + accountHolder1);
        System.out.println("balance1 = " + balance1);


        System.out.println("Account Info:");
        System.out.println("accountHolder2 = " + accountHolder2);
        System.out.println("balance2 = " + balance2);*/

    }
}