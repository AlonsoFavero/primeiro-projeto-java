package fundamentos;

public class TesteExcecao {
    public static void main(String[] args){

        int numero1 = 10;
        int numero2 = 2;
try {
    int resultado = numero1 / numero2;

    System.out.println(resultado);

}catch (ArithmeticException e){

    System.out.println("Não é possivel dividir por zero.");
    System.out.println(e);
}finally {
    System.out.println("Finalizando programa");
}
    }
}
