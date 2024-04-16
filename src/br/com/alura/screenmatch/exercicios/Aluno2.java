package br.com.alura.screenmatch.exercicios;

public class Aluno2 {
    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;

    public String getNome() {
        return nome;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }
    public double calcularMedia(){
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

}