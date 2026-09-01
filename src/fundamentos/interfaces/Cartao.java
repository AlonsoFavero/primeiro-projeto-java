package fundamentos.interfaces;

public class Cartao implements Pagamento {

   @Override
    public void pagar(){
       System.out.println("Pagamento realizado via cartão");
   }
}
