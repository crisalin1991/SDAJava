package Fundamentals.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("Type: " + bankAccount.getType());
        System.out.println("Currency: " + bankAccount.getCurrency());
        Client client = new Client("Larisa", "1234567890123", bankAccount);
        System.out.println(client.toString());

        client.getBankAccount().setBalance(12);
        System.out.println(client.toString());

        System.out.println("Client name:");
        String name = scanner.next();
        System.out.println("Client cnp:");
        String cnp = scanner.next();
        Client client2 = new Client(name,cnp);
        System.out.println(client2.toString());
    }
}
