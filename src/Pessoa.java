public class Pessoa {

    // Atributos que representam as características da pessoa
    String nome;
    int idade;

    // Método que apresenta os dados da própria pessoa
    void apresentar() {

        System.out.println("Olá, menu nome é " + nome + " e eu tenho " + idade + " anos.");
        System.out.println("Prazer em conhecer você!");

    }

    // Método que recebe um nome como parâmetro
    void apresentarPara(String nomePessoa) {
        System.out.println("Olá " + nomePessoa + ", eu sou " + nome + "!");
    }

    // Método que retorna a idade da pessoa
   int getIdade(){

        return idade;

    }
}
