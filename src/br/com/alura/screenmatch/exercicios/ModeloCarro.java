package br.com.alura.screenmatch.exercicios;

public class ModeloCarro extends Carro{
    private String nome;
    private int ano;
    private String cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void definiModeloCarro(String modelo) {
        super.definiModeloCarro(modelo);

    }

    @Override
    public void exibiInfoCarro() {
        System.out.println("O nome do carro é " + nome);
        System.out.println("O ano do carro é " + ano);
        System.out.println("A cor do carro é " + cor);
        super.exibiInfoCarro();
    }
}
