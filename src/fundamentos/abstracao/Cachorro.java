package fundamentos.abstracao;

public  class Cachorro extends Animal {

   Cachorro(String nome){
       super(nome);
   }

    public void emitirSom() {
        System.out.println("woof");
    }
}
