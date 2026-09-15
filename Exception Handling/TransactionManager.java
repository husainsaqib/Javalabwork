package com.Exception;

import java.util.Scanner;

public class TransactionManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        int balance = 0;

        try {
            for (int i = 1; i <= n; i++) {

                System.out.print("Enter transaction " + i + " (DEPOSIT/WITHDRAW): ");
                String operation = sc.next();

                System.out.print("Enter amount: ");
                int amount = sc.nextInt();

                switch (operation) {

                    case "DEPOSIT":
                        balance = balance + amount;
                        break;

                    case "WITHDRAW":
                        if (balance - amount < 0) {
                            throw new Exception("Insufficient Balance");
                        }
                        balance = balance - amount;
                        break;

                    default:
                        System.out.println("Invalid Transaction");
                }
            }

            System.out.println("Final Balance: " + balance);

        } catch (Exception e) {
            balance = 0;
            System.out.println("Transaction Failed");
        }

        sc.close();
    }
}