package edu.oit.lesson8;

public class BankAccount {
    private String id;
    private double balance = 0;
    private int transactions = 0;
    
    public static void main(String[] args) {
        BankAccount savings = new BankAccount("Jimmy");
        savings.deposit(10.00);
        savings.deposit(50.00);
        savings.deposit(10.00);
        savings.deposit(70.00);
        
        System.out.println("The balance is " + savings.getBalance() + " after four transactions.");
        
        String afford = "";
        savings.transactionFee(5.00);
        if (!savings.transactionFee(5.00)) {
            afford = "not ";
        }
        System.out.println("The balance is " + savings.getBalance() + " after charging the transactions fees one time. \nAnd the account is " + afford + "affordable.");
        
        savings.transactionFee(10.00);
        if (!savings.transactionFee(5.00)) {
            afford = "not ";
        }
        System.out.println("The balance is " + savings.getBalance() + " after charging the transactions fees the second time. \nAnd the account is " + afford + "affordable.");
    }
    
    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactions() {
        return transactions;
    }

    public BankAccount(String id) {
        this.id = id;
    }

    public void deposit(double amount) {
        if (amount > 0 && amount <= 500) {
            this.balance += amount;
            this.transactions += 1;
        }
    }
    
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            this.transactions += 1;
        }
    }
    
    public boolean transactionFee(double amount) {
        double fee = 0;
        boolean affordable;
        for (double i = 1; i<= this.transactions; i++) {
            fee += i * amount;
        }
        
        if (this.balance > fee) {
            this.balance -= fee;
            affordable = true;
        } else {
            this.balance = 0;
            affordable = false;
        }
        
        return affordable;
    }

}
