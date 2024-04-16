package br.com.alura.screenmatch.exercicios;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String verificaIdade(){
        String idadeVerificada = idade >= 18 ? "Você é maior de idade" : "Você é menor de idade";
        return idadeVerificada;

    }
}
