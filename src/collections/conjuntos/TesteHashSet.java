package collections.conjuntos;

import fundamentos.classes.Pessoa;

import java.util.HashSet;

public class TesteHashSet {

    public static void main(String[] args) {

        HashSet<Pessoa> pessoasUnicas = new HashSet<>();

        // Criando fundamentos.classes.Pessoa
        Pessoa pessoa1 = new Pessoa("Alonso", 16);

        // Adicionando a mesma fundamentos.classes.Pessoa duas vezes
        pessoasUnicas.add(pessoa1);
        pessoasUnicas.add(pessoa1);

        System.out.println(pessoasUnicas.size());

        // Criando outras Pessoas
        Pessoa pessoaTeste = new Pessoa("Alonso", 16);
        Pessoa pessoaTeste2 = new Pessoa("Carlos", 16);

        pessoasUnicas.add(pessoaTeste2);

        // Percorrendo o HashSet
        for (Pessoa pessoa : pessoasUnicas) {

            pessoa.apresentar();

        }

        // Adicionando uma fundamentos.classes.Pessoa com os mesmos dados
        pessoasUnicas.add(pessoaTeste);

        System.out.println(pessoasUnicas.size());

        // Testando contains()
        System.out.println(pessoasUnicas.contains(pessoa1));
        System.out.println(pessoasUnicas.contains(pessoaTeste));
        System.out.println(pessoasUnicas.contains(pessoaTeste2));

    }
}