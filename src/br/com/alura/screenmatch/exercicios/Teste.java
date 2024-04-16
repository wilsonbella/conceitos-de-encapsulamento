package br.com.alura.screenmatch.exercicios;

public class Teste {

    String nome;
    double preco;
    double descontoParaPix;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            double precoFinal = preco - descontoParaPix;
            return precoFinal;
        } else {
            double precoFinal = preco;
            return precoFinal;
        }

    }

}
