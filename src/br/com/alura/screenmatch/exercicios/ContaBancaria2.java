package br.com.alura.screenmatch.exercicios;

public class ContaBancaria2 {
    protected double saldo = 1000;

    public void depositar(double deposito){
        saldo += deposito;
        System.out.println("O valor de " + deposito + " foi depositado em sua conta");
    }

    public void sacar(double saque){
        saldo -= saque;
        if (saque > saldo){
            System.out.println("O valor de " + saque + " não pode ser sacado pq é maior que o seu saldo");
        }else
        System.out.println("O valor de " + saque + " foi sacado de sua conta");
    }

    public void consultarSaldo(double saldo){
        System.out.println("O seu saldo é: " + saldo);
    }
}

