package fundamentos.abstracao;

public abstract class Animal {

   public String nome; Animal(String nome){

        this.nome = nome;
    }

    public abstract void emitirSom();
}


