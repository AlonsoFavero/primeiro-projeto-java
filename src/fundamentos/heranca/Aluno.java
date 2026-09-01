package fundamentos.heranca;

public class Aluno extends Pessoa{

    private String curso;

Aluno(String nome , int idade, String curso){

    super(nome, idade);

    this.curso = curso;
}

    public String getCurso() {
        return curso;
    }
}
