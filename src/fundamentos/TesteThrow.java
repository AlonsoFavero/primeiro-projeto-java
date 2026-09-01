package fundamentos;

public class TesteThrow {
    public static void main(String[] args){

        int idade = 20;

        if(idade < 18){

            try {
                throw new IllegalArgumentException("error");
            }catch (IllegalArgumentException e){
                System.out.println("error vc é menor de idade");
            }finally {
                System.out.println("programa finalizado");
            }

        }
        System.out.println("mensagem final ");
    }
}
