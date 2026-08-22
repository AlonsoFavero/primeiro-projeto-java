import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class TestePessoa {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        HashSet<Pessoa> pessoasUnicas = new HashSet<>();
        HashMap<String , String> telefones = new HashMap<>();
        HashMap<Pessoa, String> telefonesPessoas = new HashMap<>();

        telefones.put("Alonso" , "11999999999");
        telefones.put("Alonso" , "11888888888");
        telefones.put("Carlos" , "11777777777");

        System.out.println(telefones.get("Alonso"));
        System.out.println(telefones.size());

        System.out.println(telefones.containsKey("Alonso"));
        System.out.println(telefones.containsKey("João"));

        System.out.println(telefones.containsValue("11888888888"));
        System.out.println(telefones.containsValue("11111111111"));

        System.out.println(telefones.remove("Carlos"));
        System.out.println(telefones.size());

        // Criando Pessoa
        Pessoa pessoa1 = new Pessoa("Alonso", 16);
        Pessoa novaPessoa = new Pessoa("Alonso", 16);

        telefonesPessoas.put(pessoa1,"11222222222");

        System.out.println(telefonesPessoas.containsKey(novaPessoa));
        System.out.println(telefonesPessoas.containsValue("11222222222"));
        System.out.println(telefonesPessoas.containsValue("11555555555"));

        System.out.println(telefonesPessoas.get(pessoa1));
        System.out.println(telefonesPessoas.containsKey(pessoa1));

        pessoasUnicas.add(pessoa1);
        pessoasUnicas.add(pessoa1);

        System.out.println(pessoasUnicas.size());

        Pessoa pessoaTeste = new Pessoa("Alonso", 16);
        Pessoa pessoaTeste2 = new Pessoa("Carlos", 16);

        pessoasUnicas.add(pessoaTeste2);

        for(Pessoa pessoa : pessoasUnicas){
            pessoa.apresentar();
        }

        telefones.put("Carlos" , "11777777777");

        for (Map.Entry<String, String> entrada : telefones.entrySet()){

            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());

        }

        pessoasUnicas.add(pessoaTeste);

        System.out.println(pessoasUnicas.size());

        pessoa1.apresentar();
        pessoa1.fazerAniversario();
        pessoa1.apresentarPara("Carlos");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.ehMaiorDeIdade());

        // Criando outra Pessoa
        Pessoa pessoa2 = new Pessoa("Carlos", 25);

        telefonesPessoas.put(pessoa2,"11333333333");

        System.out.println(telefonesPessoas.get(pessoa2));
        System.out.println(telefonesPessoas.containsKey(pessoa2));

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

        System.out.println(pessoa1.hashCode());
        System.out.println(pessoaTeste.hashCode());

        System.out.println(pessoas.contains(pessoa1));

        System.out.println(pessoas.contains(pessoaTeste));
        System.out.println(pessoas.contains(pessoaTeste2));

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

