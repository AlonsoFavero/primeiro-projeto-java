public class TestePessoa {

    public static void main(String[] args) {

        // Criando Pessoa
        Pessoa pessoa1 = new Pessoa("Alonso", 16);

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

        // Testando hashCode()
        Pessoa pessoaTeste = new Pessoa("Alonso", 16);

        System.out.println(pessoa1.hashCode());
        System.out.println(pessoaTeste.hashCode());
    }
}