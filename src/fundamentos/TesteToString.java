package fundamentos;

import java.util.ArrayList;
import java.util.HashSet;

public class TesteToString {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        HashSet<Pessoa> pessoasUnicas = new HashSet<>();

        Pessoa pessoa = new Pessoa("Alonso", 17);
        Pessoa pessoa1 = new Pessoa("Carlos", 25);

        pessoasUnicas.add(pessoa);
        pessoasUnicas.add(pessoa1);
        pessoas.add(pessoa);
        pessoas.add(pessoa1);

        System.out.println(pessoasUnicas);
        System.out.println(pessoas);
    }
}
