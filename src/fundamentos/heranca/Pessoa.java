package fundamentos.heranca;

public class Pessoa {

    private int idade;

    private String nome; Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
