package fundamentos;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TesteStream {
    public static void main(String[] args){

        ArrayList<Integer> numeros = new ArrayList<>();
        Stream<Integer> numerosStream = numeros.stream();
        numerosStream.forEach(numero -> System.out.println(numero));

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        numeros.stream()
                .filter(numero -> numero > 25)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));


        long quantidade = numeros.stream()
                .filter(numero -> numero > 25)
                .count();


        numeros.add(50);
        numeros.add(10);
        numeros.add(40);
        numeros.add(20);
        numeros.add(30);

        numeros.stream()
                .sorted()
                .forEach(numero -> System.out.println(numero));

        int soma = numeros.stream()
                .reduce(0, (total, numero) -> total + numero);

        System.out.println(soma);

        System.out.println(quantidade);
        System.out.println(numeros);
        System.out.println(numerosStream);

    }
}
