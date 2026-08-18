import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        String nome2 = scanner.nextLine();

        System.out.println(nome2);

        System.out.println("Digite sua idade:");

        int idadeUsuario = scanner.nextInt();

        if(idadeUsuario >= 18){
            System.out.println("maior de idade");
        }else{
            System.out.println("menor de idade");
        }

        System.out.println("meus primeiros passos para aprender java ");

        String nome = "Alonso";
        int idade = 20;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println("meu nome é " + nome + " e tenho " + idade + " anos. ");

        int numero1 = 10;
        int numero2 = 5;

        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 / numero2);

        double decimal1 = 10;
        double decimal2 = 3;

        System.out.println(decimal1 / decimal2);

        double preco = 19.99;
        int quantidade = 3;

        System.out.println(preco * quantidade);

        boolean usuarioLogado = true;
        boolean produtoDisponivel = false;

        System.out.println(usuarioLogado);
        System.out.println(produtoDisponivel);

        System.out.println(idade >= 18);
        System.out.println(idade < 18);

        boolean maiorDeIdade = idade >= 18;

        System.out.println(maiorDeIdade);

        if (maiorDeIdade){
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }

        if(idade <= 12){
            System.out.println("criança");
        } else if(idade >= 18){
            System.out.println("Adulto");
        }else{
            System.out.println("Adolescente");
        }

        boolean idadeValida = idade >= 18 && idade <= 30;

        System.out.println(idadeValida);

        boolean temAutorizacao = true;
        boolean podeEntrar = idade >= 18 || temAutorizacao == true;

        System.out.println(podeEntrar);

        boolean semAutorizacao = !temAutorizacao ;

        System.out.println(semAutorizacao);

        mostrarMensagem();
        mostrarNome();
    }

    static void mostrarMensagem(){
        System.out.println("estou aprendendo métodos em java!");
    }

    static void mostrarNome(String nome){

        System.out.println("Olá" + nome );
    }
}
