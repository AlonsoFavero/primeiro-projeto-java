package fundamentos;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {

    // Atributos que representam as características da pessoa
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setIdade(int idade) {

        if (idade >= 0) {

            this.idade = idade;

        } else {
            System.out.println("idade invalida");
        }
    }


    // Método que apresenta os dados da própria pessoa
   public void apresentar() {

        System.out.println("Olá, menu nome é " + nome + " e eu tenho " + idade + " anos.");
        System.out.println("Prazer em conhecer você!");

    }

    // Método que recebe um nome como parâmetro
    void apresentarPara(String nomePessoa) {
        System.out.println("Olá " + nomePessoa + ", eu sou " + nome + "!");
    }

    public String getNome() {

        return nome;

    }

    // Método que retorna a idade da pessoa
    public int getIdade() {

        return idade;

    }

   public Pessoa(String nome, int idade) {

        this.nome = nome;
        setIdade(idade);

    }

    void fazerAniversario() {
        this.idade = idade + 1;
    }

    boolean ehMaiorDeIdade() {

        if (idade >= 18) {

            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Pessoa) {

            Pessoa outraPessoa = (Pessoa) obj;

            return getNome().equals(outraPessoa.getNome()) && getIdade() == outraPessoa.getIdade();

        }else {
            return false;
        }

    }

    @Override
    public int hashCode()    {

    return Objects.hash(getNome(), getIdade());

    }

    @Override
    public String toString(){

        return "fundamentos.Pessoa{nome='" + getNome() + "', idade=" + getIdade() + "}";
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.idade - outraPessoa.idade;
    }

}


