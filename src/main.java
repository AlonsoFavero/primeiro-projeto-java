public class main {
    public static void main(String[] args) {
        System.out.println("meus primeiros passos para aprender java ");

        String nome = "Alonso";
        int idade = 16;

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
    }
}
