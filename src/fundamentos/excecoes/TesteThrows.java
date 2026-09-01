package fundamentos.excecoes;

public class TesteThrows {
    public static void main(String[] args){

        try{
            verificarIdade(16);
        }catch (IllegalArgumentException e){

            System.out.println("error vc é menor de idade");

        }

    }
    public static void verificarIdade(int idade) throws IllegalArgumentException{

        if(idade < 18){
            throw new IllegalArgumentException();
        }
    }
}
