package fundamentos.composicao;

public class TesteComposicao {
    public static void main(String[] args){

        Carro meuCarro = new Carro();

        Motor nome = meuCarro.getMeuMotor();

        nome.ligar();
    }
}
