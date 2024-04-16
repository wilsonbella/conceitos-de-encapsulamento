package br.com.alura.screenmatch.exercicios;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int avaliacao;
    int numAvaliacao;

    void exibeFicha(){
        System.out.println("Título da música " + titulo);
        System.out.println("Artista " + artista);
        System.out.println("Ano de lançamento " + anoLancamento);
    }
    void avalia(double nota){
        avaliacao += nota;
        numAvaliacao ++;
    }
    double mediaAvaliacoes(){
        return avaliacao / numAvaliacao;
    }
}
