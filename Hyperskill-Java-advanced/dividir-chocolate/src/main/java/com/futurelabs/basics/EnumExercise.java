package com.futurelabs.basics;

import java.util.Scanner;

enum Operation {
    /**
     * deposit (add) an amount into an Account
     */
    DEPOSIT,
    /**
     * withdraw (subtract) an amount from an Account
     */
    WITHDRAW
}

class Account {

    private String code;
    private Long balance;

    public String getCode() {
        return code;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}

public class EnumExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }
    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        if (Operation.WITHDRAW == operation && account.getBalance() < sum) {
            System.out.println("Not enough money to withdraw.");
            return false;
        }

        long newBalance = Operation.WITHDRAW == operation ?
                account.getBalance() - sum : account.getBalance() + sum;

        account.setBalance(newBalance);
        return true;
    }
}
