package fundamentos.interfaces;

public class TesteInterface {
    public static void main(String[] args){

        Pagamento meuPagamento = new Pix();
        Pagamento meuPagamento2 = new Cartao();

        meuPagamento.pagar();
        meuPagamento2.pagar();

    }
}
