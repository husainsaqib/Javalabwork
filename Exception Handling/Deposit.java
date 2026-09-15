package com.Exception;
import java.util.Scanner;

public class Deposit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        int n = sc.nextInt();
        sc.nextLine(); 
        int balance = 0;
        try {

            for (int i = 0; i < n; i++) {

                String transaction = sc.nextLine();

                String[] parts = transaction.split(" ");
                String type = parts[0];
                int amount = Integer.parseInt(parts[1]);

                if (type.equals("DEPOSIT")) {

                    balance += amount;

                } else if (type.equals("WITHDRAW")) {

                    if (balance < amount) {
                        throw new Exception("Insufficient Balance");
                    }

                    balance -= amount;
                }
            }

            System.out.println(balance);

        } catch (Exception e) {

            balance = 0;
            System.out.println("Transaction Failed");
        }

        sc.close();
    }
}