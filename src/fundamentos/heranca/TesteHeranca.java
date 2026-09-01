package fundamentos.heranca;

public class TesteHeranca {
    public static void main(String[] args){

        Aluno meuAluno = new Aluno("Alonso", 18, "ADS");


        System.out.println(
                meuAluno.getNome()
        );

        System.out.println(
                meuAluno.getIdade()
        );

        System.out.println(
                meuAluno.getCurso()
        );
    }
}
