package com.bruno.javacore.ZZFthreads.test;

import com.bruno.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(10);
            if (account.getBalance() < 0) {
                System.out.println("Ferrou");
            }
        }
    }

    private void withdraw(int amount) {
        synchronized (account) {
            System.out.println(getThreadName() + " Dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " Está indo sacar dinheiro");
                account.withdraw(amount);
                
                System.out.println(getThreadName() + " completou o saque, valor atual da conta " + account.getBalance());

            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

}
