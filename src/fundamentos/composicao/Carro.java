package fundamentos.composicao;

public class Carro {

    Motor meuMotor;

    public Carro(){
        meuMotor = new Motor();
    }

    public Motor getMeuMotor() {
        return meuMotor;
    }
}
