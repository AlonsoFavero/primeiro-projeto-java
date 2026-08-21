import java.util.ArrayList;

public class TestePessoa {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Criando Pessoa
        Pessoa pessoa1 = new Pessoa("Alonso", 15);

        pessoa1.apresentar();
        pessoa1.fazerAniversario();
        pessoa1.apresentarPara("Carlos");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.ehMaiorDeIdade());

        // Criando outra Pessoa
        Pessoa pessoa2 = new Pessoa("Carlos", 25);

        pessoa2.apresentar();

        // Criando Aluno
        Aluno aluno1 = new Aluno("João", 20, "ADS");

        aluno1.apresentar();

        // Criando Funcionario
        Funcionario funcionario1 = new Funcionario("Felipe", 15, "Desenvolvedor");

        System.out.println(funcionario1.getCargo());
        funcionario1.apresentar();

        // Criando Funcionario através de uma referência Pessoa
        Pessoa pessoaFuncionario = new Funcionario("Felipe", 25, "engenheiro");

        pessoaFuncionario.apresentar();

        // Verificando o tipo do objeto e fazendo casting
        if (pessoaFuncionario instanceof Funcionario) {

            System.out.println(((Funcionario) pessoaFuncionario).getCargo());

        }

        // Adicionando objetos à lista
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(funcionario1);
        pessoas.add(aluno1);

        // Percorrendo a lista
        for (Pessoa pessoa : pessoas) {

            pessoa.apresentar();

        }

        // Verificando se o objeto é um Aluno
        if (pessoas.get(3) instanceof Aluno) {

            System.out.println("É um aluno");

        } else {

            System.out.println("Não é um aluno");

        }

        // Verificando se o objeto é um Funcionario
        if (pessoas.get(2) instanceof Funcionario) {

            System.out.println("É um funcionário");

        } else {

            System.out.println("Não é funcionário");

        }

        // Removendo o Funcionario pela posição
        pessoas.remove(2);

        System.out.println(pessoas.size());

        // Percorrendo a lista depois da remoção
        for (Pessoa pessoa : pessoas) {

            pessoa.apresentar();

        }
    }
}

