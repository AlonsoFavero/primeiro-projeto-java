package collections.conjuntos;

import java.util.LinkedHashSet;

public class TesteLinkedHashSet {
    public static void main(String[] args){

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        numeros.add(20);
        numeros.add(30);
        numeros.add(10);

        System.out.println(numeros);

        System.out.println(numeros.contains(20));

        numeros.remove(30);

        System.out.println(numeros);
    }
}
