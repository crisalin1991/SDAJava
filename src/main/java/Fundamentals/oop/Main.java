package Fundamentals.oop;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Type: " + bankAccount.getType());
        System.out.println("Currency: " + bankAccount.getCurrency());
        Client client = new Client("Larisa", "1234567890123", bankAccount);
        System.out.println(client.toString());
    }
}
