package fundamentos.interfaces;

public class Pix implements Pagamento{

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado via pix");
    }
}
