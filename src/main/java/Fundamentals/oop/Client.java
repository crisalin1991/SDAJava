package Fundamentals.oop;

public class Client {
    private String name;
    private String cnp;
    private BankAccount bankAccount;

    public Client(String name, String cnp, BankAccount bankAccount) {
        this.name = name;
        this.cnp = cnp;
        this.bankAccount = bankAccount;
    }
    public Client(String name, String cnp){
        this.name = name;
        this.cnp = cnp;
        this.bankAccount = new BankAccount();
    }

    public Client() {
        this.bankAccount = new BankAccount();
    }

    public String toString() {
        return "Name = " + this.name + " , CNP = " + this.cnp + " , Bank Account = " + this.bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
