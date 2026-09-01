package fundamentos;

public class TesteClasseAbstrata{
    public static void main(String[] args){

        Cachorro meuCachorro = new Cachorro("Bobe");
        Gato meuGato = new Gato("Mia");


        meuCachorro.emitirSom();
        meuGato.emitirSom();
    }
}
