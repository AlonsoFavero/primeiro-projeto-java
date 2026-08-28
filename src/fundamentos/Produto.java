package fundamentos;

public class Produto {

    // Atributos que representam as caracteristícas do produto
    String nome;
    double preco;

    // Método responsável pos mostrar as informações do produto
    void mostrarInformacoes(){
        System.out.println("nome do produto " + nome );
        System.out.println("preço do produto " + preco );
    }
}
