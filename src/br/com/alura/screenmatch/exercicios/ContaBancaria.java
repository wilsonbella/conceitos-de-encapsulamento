package br.com.alura.screenmatch.exercicios;

public class ContaBancaria {
    private int numeroConta;
    private double  saldo = 15000;
    public String titular;


    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
