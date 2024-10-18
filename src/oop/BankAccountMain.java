package oop;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        BankAccount myAccount = new BankAccount();
        System.out.println("Välkommen till din bank, vad vill du göra?");
        int val;
        do {
            System.out.println("1 Sätt mitt Saldo");
            System.out.println("2 Se mitt saldo");
            System.out.println("3 Insättning");
            System.out.println("4 Uttag");
            System.out.println("9 Avsluta");

            val = scannner.nextInt();
            if (val == 1) {
                System.out.print("Vilket saldo vill du ha på ditt konto");
                int newSaldo = scannner.nextInt();
                myAccount.setSaldo(newSaldo);
            }
            if (val == 2) System.out.println("Ditt saldo är: " + myAccount.getSaldo());
            if (val == 3) {
                System.out.print("Hur mycket vill du sätta in: ");
                int amount = scannner.nextInt();
                myAccount.deposit(amount);
            }
            if (val == 4) {
                System.out.print("Hur mycket vill du ta ut ");
                int amount = scannner.nextInt();
                if (myAccount.withdraw(amount)) System.out.println("Ditt uttag är registrerat");
                else System.out.println("Saldot kan inte understiga 0");
            }

        } while (val != 9);

    }
}
