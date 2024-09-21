package com.futurelabs.poo.mguarniz.semana2.tarea.ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        print("\n=============== transaccion 01 ============== ");
        print("============= deposito negativo ============= ");
        Account accountFromManuel = new Account("Manuel Guarniz", "123456789", 100, "Simple");
        print(accountFromManuel);

        double amountDeposited = -1;
        boolean result = accountFromManuel.deposit(amountDeposited);
        print("El deposito de $ %s se proceso %s éxito", amountDeposited, result ? "CON" : "SIN");
        print("Saldo actual: $ %.2f", accountFromManuel.getBalance());

        print("\n=============== transaccion 02 ============== ");
        print("================= deposito OK =============== ");
        print(accountFromManuel);

        double amountDeposited2 = 20;
        boolean result2 = accountFromManuel.deposit(amountDeposited2);
        print("El deposito de $ %s se proceso %s éxito", amountDeposited2, result2 ? "CON" : "SIN");
        print("Saldo actual: $ %.2f", accountFromManuel.getBalance());

        print("\n=============== transaccion 03 ============== ");
        print("================= retiro OK ================= ");
        print(accountFromManuel);

        double amountWithdraw1 = 70;
        boolean result3 = accountFromManuel.withdraw(amountWithdraw1);
        print("El retiro de $ %s se proceso %s éxito", amountWithdraw1, result3 ? "CON" : "SIN");
        print("Saldo actual: $ %.2f", accountFromManuel.getBalance());


        print("\n=============== transaccion 04 ============== ");
        print("============== retiro SIN saldo ============= ");
        print(accountFromManuel);

        double amountWithdraw2 = 80;
        boolean result4 = accountFromManuel.withdraw(amountWithdraw2);
        print("El retiro de $ %s se proceso %s éxito", amountWithdraw2, result4 ? "CON" : "SIN");
        print("Saldo actual: $ %.2f", accountFromManuel.getBalance());
    }

    private static void print() {
        System.out.println();
    }
    private static void print(Object text) {
        System.out.println(text);
    }
    private static void print(String text, Object... params) {
        System.out.printf(text, params);
        print();
    }
}
