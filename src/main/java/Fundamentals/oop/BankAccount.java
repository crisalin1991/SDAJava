package Fundamentals.oop;

public class BankAccount {
    private String type;
    private double balance;
    private String currency;
    private String accountType;

    public BankAccount(String type, String currency) {
        this.type = type;
        this.currency = currency;
        this.balance = 0;
    }

    public BankAccount() {
        this.type = "SAVING";
        this.currency = "USD";
        this.balance = 0;
    }

    public void AddMoney(double newMoney) {
        if (this.accountType == "SPENDING") {
            System.out.println("Please add at least 10% of actual balance");
        } else {
            this.balance += newMoney;
        }
        return;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ",balance=" + balance +
                ",currency = " + currency + '\'' +
                '}';

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
