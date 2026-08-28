package fundamentos;

public class Funcionario extends Pessoa {

    private String cargo;

   public Funcionario(String nome, int idade, String cargo) {

        super(nome, idade);
        setCargo(cargo);

    }

    public void setCargo(String cargo) {

        this.cargo = cargo;

    }

    public String getCargo(){
        return cargo;
    }

    @Override
   public void apresentar(){
        System.out.println(
                "Olá, meu nome é " + getNome() +
                        ", tenho " + getIdade() +
                        " anos e trabalho como " + getCargo());
    }

}