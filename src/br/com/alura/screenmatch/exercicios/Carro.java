package br.com.alura.screenmatch.exercicios;

public class Carro {
    private String modelo;
    private double precoDo1Ano;
    private double precoDo2Ano;
    private double precoDo3Ano;

    public void definiModeloCarro(String modelo){
        this.modelo = modelo;
    }
    public void definiPreco(double precoDo1Ano, double precoDo2Ano, double precoDo3Ano){
        this.precoDo1Ano = precoDo1Ano;
        this.precoDo2Ano = precoDo2Ano;
        this.precoDo3Ano = precoDo3Ano;
    }
    public void exibiInfoCarro(){
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Preço do 1° ano: " + precoDo1Ano);
        System.out.println("Preço do 2° ano: " + precoDo2Ano);
        System.out.println("Preço do 3° ano: " + precoDo3Ano);
        System.out.println("O menor preço foi: " + calculaPrecoMenor());
        System.out.println("O maior preço foi: " + calculaPrecoMaior());
    }
    public double calculaPrecoMenor(){
        double menorPreco = precoDo1Ano;
        if (precoDo2Ano < precoDo1Ano){
            menorPreco = precoDo2Ano;
        }if (precoDo3Ano < precoDo2Ano){
            menorPreco = precoDo3Ano;
        }
        return menorPreco;
    }
    public double calculaPrecoMaior(){
        double maiorPreco = precoDo1Ano;
        if (precoDo2Ano > precoDo1Ano){
            maiorPreco = precoDo2Ano;

        }if (precoDo3Ano > precoDo2Ano){
            maiorPreco = precoDo3Ano;
        }
        return maiorPreco;
    }
}
