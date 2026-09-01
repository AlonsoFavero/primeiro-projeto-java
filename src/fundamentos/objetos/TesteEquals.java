package fundamentos.objetos;

import fundamentos.classes.Pessoa;

import java.util.HashSet;

public class TesteEquals {
    public static void main(String[] args){

        HashSet<Pessoa> pessoaHashSet = new HashSet<>();

        Pessoa pessoa1 = new Pessoa("Alonso", 16);
        Pessoa pessoa2 = new Pessoa("Alonso", 16);
        Pessoa pessoa3 = new Pessoa("Carlos", 16);
        Pessoa pessoa4 = new Pessoa("Alonso", 17);

        System.out.println(pessoa1.equals(pessoa2));
        System.out.println(pessoa1.equals(pessoa3));
        System.out.println(pessoa1.equals(pessoa4));

        System.out.println(pessoa1.hashCode());
        System.out.println(pessoa2.hashCode());
        System.out.println(pessoa3.hashCode());

        pessoaHashSet.add(pessoa1);
        pessoaHashSet.add(pessoa2);
        pessoaHashSet.add(pessoa3);

        System.out.println(pessoaHashSet.size());
    }
}
