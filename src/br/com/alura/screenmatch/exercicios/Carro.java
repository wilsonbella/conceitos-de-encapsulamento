package br.com.alura.screenmatch.exercicios;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFicha(){
        System.out.println("Modelo do carro " + modelo);
        System.out.println("Ano " + ano);
        System.out.println("Cor " + cor);
    }
    int idadeDoCarro (){
        return 2024 - ano;
    }
}
