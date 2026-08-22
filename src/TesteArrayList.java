import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Criando Pessoas
        Pessoa pessoa1 = new Pessoa("Alonso", 16);
        Pessoa pessoa2 = new Pessoa("Carlos", 25);

        // Criando Funcionario
        Funcionario funcionario1 = new Funcionario("Felipe", 15, "Desenvolvedor");

        // Criando Aluno
        Aluno aluno1 = new Aluno("João", 20, "ADS");

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

        // Testando contains()
        System.out.println(pessoas.contains(pessoa1));

        Pessoa pessoaTeste = new Pessoa("Alonso", 16);

        System.out.println(pessoas.contains(pessoaTeste));

        // Removendo o Funcionario pela posição
        pessoas.remove(2);

        System.out.println(pessoas.contains(funcionario1));

        System.out.println(pessoas.size());

        // Percorrendo a lista depois da remoção
        for (Pessoa pessoa : pessoas) {

            pessoa.apresentar();

        }
    }
}