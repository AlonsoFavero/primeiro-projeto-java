package fundamentos.sobrecarga;

public class TesteSobrecarga {
    public static void main(String[] args){

        Calculadora calculadora = new Calculadora();

    double resultado1 = calculadora.somar(10.5, 5.5);
    int resultado2 = calculadora.somar(40,90);
     int resultado3 = calculadora.somar(30, 45, 89);

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }

}
