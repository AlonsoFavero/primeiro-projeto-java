import java.util.ArrayList;

public class TestePessoa {

    public static void main(String[] args){

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Aluno aluno1 = new Aluno("João", 20, "ADS");

        aluno1.apresentar();

        Funcionario funcionario1 = new Funcionario("Felipe", 15, "Desenvolvedor");
        Pessoa pessoaFuncionario = new Funcionario("Felipe", 25, "engenheiro");

        System.out.println(funcionario1.getCargo());
        funcionario1.apresentar();
        pessoaFuncionario.apresentar();

        // Criando um objeto a partir da classe Produto
        Produto produto1 = new Produto();

        // Atribuindo valores aos atributos do objeto
        produto1.nome = "Notebook";
        produto1. preco = 3500.00;

        // Chamando um método do objeto
        produto1.mostrarInformacoes();

        // Criando um objeto a partir da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Alonso", 15);

        //Chamando um método sem parâmetro
        pessoa1.apresentar();
        pessoa1.fazerAniversario();

        // Chamando um método e passando um valor como parâmetro
        pessoa1.apresentarPara("Carlos");

        System.out.println(pessoa1.getNome());

        // Chamando um método que retorna um valor
        System.out.println(pessoa1.getIdade());

        System.out.println(pessoa1.ehMaiorDeIdade());


        // Criando outro objeto da mesma classe
        Pessoa pessoa2 = new Pessoa("Carlos", 25);

        pessoa2.apresentar();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(funcionario1);
        pessoas.add(aluno1);

        for(Pessoa pessoa : pessoas){
            pessoa.apresentar();
        }

        if(pessoas.get(3) instanceof  Aluno){

            System.out.println("é um aluno");

        }else{

            System.out.println("não é um aluno");

        }

        if (pessoas.get(2) instanceof Funcionario) {

            System.out.println("É um funcionário");

        }else {

            System.out.println("Não é funcionario");

        }

        pessoas.remove(2);
        System.out.println(pessoas.size());
        pessoas.get(2).apresentar();

        // Criando um terceiro objeto da classe pessoa
        Pessoa pessoa3 = new Pessoa("João", 30);

        pessoa3.apresentar();

        Pessoa pessoa4 = new Pessoa("Lucas", -40);

        pessoa4.apresentar();
    }

}
