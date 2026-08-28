package antigos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        HashMap<String, String> pessoa = new HashMap<>();

        pessoa.put("idade", "20");
        pessoa.put("idade", "21");
        pessoa.put("nome", "Alonso");
        pessoa.remove("idade");

        System.out.println(pessoa.get("nome"));
        System.out.println(pessoa.containsKey("nome"));
        System.out.println(pessoa.containsValue("Alonso"));
        System.out.println(pessoa);

        nomes.add("Alonso");
        nomes.add("Carlos");
        nomes.add("João");

        for(int i = 0; i < nomes.size(); i++){
        System.out.println(nomes.get(i));
        }

        System.out.println(nomes.contains("Carlos"));
        System.out.println(nomes.set(1, "Pedro"));
        System.out.println(nomes);
        System.out.println(nomes.remove(1));
        System.out.println(nomes.size());

        for (int i = 1; i <= 10; i++) {
                System.out.println(i * 5);
        }

        int contador = 2;

        while(contador <= 10){
            System.out.println(contador);
            contador = contador + 2;
        }

        int[] numeros = {
                10,
                20,
                30,
                40,
                50
        };

        int soma = 0;

        for (int i = 0; i <= 4; i++) {
            soma = soma + numeros[i];
        }
        System.out.println(soma);

        int maiorValor = numeros[0];
        int menorValor = numeros[0];

        for (int i = 0; i <= 4; i++) {
            if(numeros[i] > maiorValor){
                maiorValor = numeros[i];
            }
        }

        for (int i = 0; i <= 4; i++) {
            if(numeros[i] < menorValor){
                menorValor = numeros[i];
            }
        }

        int somaMedia = 0;

        for (int i = 0; i <= 4; i++) {
            somaMedia = somaMedia + numeros[i];
        }

        double media = somaMedia / 5;

        for (int i = 0; i < numeros.length; i++) {
          if(numeros[i] > 25){
              System.out.println(numeros[i]);
          }
        }

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < 30){
                System.out.println(numeros[i]);
            }
        }

        System.out.println(numeros.length);
        System.out.println(media);
        System.out.println(menorValor);
        System.out.println(maiorValor);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        String nome2 = scanner.nextLine();

        System.out.println(nome2);

        System.out.println("Digite sua idade:");

        int idadeUsuario = scanner.nextInt();

        if (idadeUsuario >= 18) {
            System.out.println("maior de idade");
        } else {
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

        if (maiorDeIdade) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }

        if (idade <= 12) {
            System.out.println("criança");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adolescente");
        }

        boolean idadeValida = idade >= 18 && idade <= 30;

        System.out.println(idadeValida);

        boolean temAutorizacao = true;
        boolean podeEntrar = idade >= 18 || temAutorizacao == true;

        System.out.println(podeEntrar);

        boolean semAutorizacao = !temAutorizacao;

        System.out.println(semAutorizacao);

        mostrarMensagem();
        mostrarNome("Alonso");
    }

    static void mostrarMensagem(){
        System.out.println("estou aprendendo métodos em java!");
    }

    static void mostrarNome(String nome){

        System.out.println("Olá" + nome );
    }
}
