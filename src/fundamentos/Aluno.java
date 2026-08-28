package fundamentos;

public class Aluno extends Pessoa {

    private String curso;

   public Aluno(String nome, int idade, String curso) {

        super(nome, idade);
        setCurso(curso);

    }

    public void setCurso(String curso) {

        this.curso = curso;

    }

    public String getCurso(){
        return curso;
    }

    @Override
   public void apresentar(){
        System.out.println(
                "Olá, meu nome é " + getNome() +
                        ", tenho " + getIdade() +
                        " anos e estudo " + getCurso());
    }

}
