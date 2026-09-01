package fundamentos.arrays;

public class Arrays {

    public static void main(String[] args) {

        int[] numeros = {
                10,
                20,
                30,
                40,
                50
        };

        // Acessando um elemento
        System.out.println(numeros[0]);

        // Percorrendo o array
        for (int i = 0; i <= 4; i++) {
            System.out.println(numeros[i]);
        }

        // Somando os elementos
        int soma = 0;

        for (int i = 0; i <= 4; i++) {
            soma = soma + numeros[i];
        }

        System.out.println("Soma: " + soma);

        // Encontrando o maior valor
        int maiorValor = numeros[0];

        for (int i = 0; i <= 4; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
        }

        System.out.println("Maior valor: " + maiorValor);

        // Encontrando o menor valor
        int menorValor = numeros[0];

        for (int i = 0; i <= 4; i++) {
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }
        }

        System.out.println("Menor valor: " + menorValor);

        // Calculando a média
        double media = soma / 5.0;

        System.out.println("Média: " + media);

        // Quantidade de elementos
        System.out.println("Quantidade: " + numeros.length);

        // Números maiores que 25
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 25) {
                System.out.println(numeros[i]);
            }
        }

        // Números menores que 30
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 30) {
                System.out.println(numeros[i]);
            }
        }
    }
}