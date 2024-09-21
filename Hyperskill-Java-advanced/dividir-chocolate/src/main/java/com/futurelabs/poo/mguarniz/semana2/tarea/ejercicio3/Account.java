package com.futurelabs.poo.mguarniz.semana2.tarea.ejercicio3;

public class Account {
    private String customerName;
    private String accountNumber;
    private double balance;
    private String interestType;

    public Account() {}
    public Account(String customerName, String accountNumber, double balance, String interestType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestType = interestType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getInterestType() {
        return interestType;
    }

    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    public boolean deposit(double amount) {
        boolean result = amount >= 0;
        if (result) {
            this.balance = this.balance + amount;
        }
        return result;
    }

    public boolean withdraw(double amount) {
        boolean result = amount >= 0 && (this.getBalance() - amount) >= 0;
        if (result) {
            this.balance = this.balance - amount;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("Cuenta %s Nro: %s \n" +
                "Propietario: %s \n" +
                "Saldo: $ %s \n",
                this.getInterestType(),
                this.getAccountNumber(),
                this.getCustomerName(),
                this.getBalance());
    }
}
