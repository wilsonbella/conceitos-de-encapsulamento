package br.com.alura.screenmatch.exercicios;

public class ContaCorrente extends ContaBancaria2{
    private int tarifa = 10;
    public void cobrarTarifaMensal(){
        double saldoAtual = saldo - tarifa;
        System.out.println("Seu saldo atual é de " + saldoAtual);
    }
}
