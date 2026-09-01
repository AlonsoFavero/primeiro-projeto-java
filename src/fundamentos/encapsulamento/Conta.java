package fundamentos.encapsulamento;

public class Conta {

    private double saldo;

    private String titular; Conta(String titular, double saldo){

        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {

        return saldo;
    }

    public String getTitular(){

        return titular;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }
}
