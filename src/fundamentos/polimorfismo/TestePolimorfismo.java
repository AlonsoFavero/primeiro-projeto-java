package fundamentos.polimorfismo;

public class TestePolimorfismo {
    public static void main(String[] args){

        Animal meuAnimal = new Cachorro();
        Animal meuAnimal2 = new Gato();
        Animal meuAnimal3 = new Animal();

        meuAnimal.emitirSom();
        meuAnimal2.emitirSom();
        meuAnimal3.emitirSom();
    }
}
