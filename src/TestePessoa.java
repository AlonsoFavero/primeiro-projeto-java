public class TestePessoa {

    public static void main(String[] args){

        // Criando um objeto a partir da classe Produto
        Produto produto1 = new Produto();

        // Atribuindo valores aos atributos do objeto
        produto1.nome = "Notebook";
        produto1. preco = 3500.00;

        // Chamando um método do objeto
        produto1.mostrarInformacoes();

        // Criando um objeto a partir da classe Pessoa
        Pessoa pessoa1 = new Pessoa();

        // Atribuindo valores aos atributos da pessoa
        pessoa1.setNome("Alonso");
        pessoa1.setIdade(18);

        //Chamando um método sem parâmetro
        pessoa1.apresentar();

        // Chamando um método e passando um valor como parâmetro
        pessoa1.apresentarPara("Carlos");

        System.out.println(pessoa1.getNome());

        // Chamando um método que retorna um valor
        System.out.println(pessoa1.getIdade());

        // Criando outro objeto da mesma classe
        Pessoa pessoa2 = new Pessoa();

        // Cada objeto possui seus próprios valores
        pessoa2.setNome("Carlos");
        pessoa2.setIdade(25);

        pessoa2.apresentar();

        // Criando um terceiro objeto da classe pessoa
        Pessoa pessoa3 = new Pessoa();

        // Definindo os valores desse objeto
        pessoa3.setNome("João");
        pessoa3.setIdade(30);

        pessoa3.apresentar();

    }

}
