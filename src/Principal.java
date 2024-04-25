import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.exercicios.*;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Meu malvado favorito");
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setAnoDeLancamento(2000);
        meuFilme.setDuracaoEmMinutos(198);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setTitular("Wilson");
        contaBancaria.setNumeroConta(10);
        contaBancaria.getTitular();
        contaBancaria.getNumeroConta();
        contaBancaria.getSaldo();
        System.out.println("O titular " + contaBancaria.getTitular());
        System.out.println("da conta " + contaBancaria.getNumeroConta());
        System.out.println("Tem " + contaBancaria.getSaldo() + " de saldo");

        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Wilson");
        idadePessoa.setIdade(17);
        idadePessoa.verificaIdade();
        System.out.println(idadePessoa.verificaIdade());

        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(2000.0);
        System.out.println("Produto " + produto.getNome());
        System.out.println("preço do produto " + produto.getPreco());
        produto.aplicarDesconto(20);
        System.out.println("O preço do produto com desconto é " + produto.getPreco());

        Aluno2 aluno2 = new Aluno2();
        aluno2.setNome("João");
        aluno2.setNota1(10);
        aluno2.setNota2(9);
        aluno2.setNota3(8);

        System.out.println("A média de " + aluno2.getNome() + " é " + aluno2.calcularMedia());

        Livro livro = new Livro();
        livro.setTitulo("Lógica de Programação");
        livro.setAutor("Carlos Andrade");
        livro.exibirDetalhes();

        Serie sobrenatural = new Serie();
        sobrenatural.setNome("Sobrenatural");
        sobrenatural.setAnoDeLancamento(2001);
        sobrenatural.exibeFichaTecnica();
        sobrenatural.setTemporadas(10);
        sobrenatural.setEpisodiosPorTemporada(10);
        sobrenatural.setMinutosPorEpisodios(20);
        System.out.println("A duração da série: " + sobrenatural.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.definiModeloCarro("Sedan");
        modeloCarro.setNome("Corsa");
        modeloCarro.setAno(2000);
        modeloCarro.setCor("Prata");
        modeloCarro.definiPreco(25000, 30000, 45000);
        modeloCarro.calculaPrecoMenor();
        modeloCarro.calculaPrecoMaior();
        modeloCarro.exibiInfoCarro();






        /* br.com.alura.screenmatch.exercicios.Pessoa pessoa = new br.com.alura.screenmatch.exercicios.Pessoa();
        pessoa.mensagem();


        br.com.alura.screenmatch.exercicios.Calculadora calculadora = new br.com.alura.screenmatch.exercicios.Calculadora();
        double resultado = calculadora.retornaDobro(5);
        System.out.println(resultado);

        br.com.alura.screenmatch.exercicios.Carro parati = new br.com.alura.screenmatch.exercicios.Carro();
        parati.modelo = "Wagon";
        parati.ano = 1998;
        parati.cor = "Prata";
        parati.exibeFicha();
        int idade = parati.idadeDoCarro();
        System.out.println(idade + " anos");

        br.com.alura.screenmatch.exercicios.Aluno aluno = new br.com.alura.screenmatch.exercicios.Aluno();
        aluno.nome = "Wilson";
        aluno.idade = 38;
        aluno.exibeInformacoes(); */



    }
}
