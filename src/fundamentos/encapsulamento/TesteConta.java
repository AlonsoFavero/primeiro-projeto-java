package fundamentos.encapsulamento;

public class TesteConta {
    public static void main(String[] args){

        Conta minhaConta = new Conta("Carlos", 500);

        System.out.println(

        minhaConta.getTitular()

        );

        System.out.println(
        minhaConta.getSaldo()
        );

        minhaConta.setSaldo(450);

        System.out.println(
        minhaConta.getSaldo()
        );

    }
}
