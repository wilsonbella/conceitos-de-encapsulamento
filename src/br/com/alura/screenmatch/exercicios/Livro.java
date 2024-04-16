package br.com.alura.screenmatch.exercicios;

public class Livro {
    private  String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("O titulo do livro é " + titulo);
        System.out.println("O autor é o " + autor);
    }
}
