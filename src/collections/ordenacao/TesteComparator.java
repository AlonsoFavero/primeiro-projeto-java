package collections.ordenacao;

import fundamentos.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteComparator {
    public static void main(String[] args){

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Criando Pessoas
        Pessoa pessoa1 = new Pessoa("Alonso", 16);
        Pessoa pessoa2 = new Pessoa("Carlos", 25);
        Pessoa pessoa3 = new Pessoa("Felipe", 30);
        Pessoa pessoa4 = new Pessoa("Maria", 25);

        pessoas.add(pessoa3);
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa4);

        System.out.println(pessoas);

        Comparator<Pessoa> comparador = (p1, p2) -> {
            return p1.getNome().compareTo(p2.getNome());
        };

        Collections.sort(pessoas, comparador);

        System.out.println(pessoas);
    }
}
