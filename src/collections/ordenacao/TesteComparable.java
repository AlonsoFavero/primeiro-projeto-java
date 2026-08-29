package collections.ordenacao;

import fundamentos.Pessoa;

import java.util.ArrayList;
import java.util.Collections;

public class TesteComparable {
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

        Collections.sort(pessoas);

        System.out.println(pessoas);
    }
}
