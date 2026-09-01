package fundamentos.abstracao;

public class Gato extends Animal {

      Gato(String nome){
        super(nome);
    }

    public void emitirSom() {
        System.out.println("miau");
    }
}
