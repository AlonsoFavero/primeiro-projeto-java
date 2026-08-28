package exercícios;

import java.util.ArrayList;

public class ExerciciosArrayList {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando nomes
        nomes.add("Alonso");
        nomes.add("Carlos");
        nomes.add("João");

        System.out.println(nomes);

        // Acessando o primeiro elemento
        System.out.println(nomes.get(0));

        // Removendo Carlos
        System.out.println(nomes.remove(1));
        System.out.println(nomes);

        // Quantidade de elementos
        System.out.println(nomes.size());

        // Verificando se existe um nome
        System.out.println(nomes.contains("Carlos"));

        // Alterando um nome
        nomes.set(1, "Pedro");
        System.out.println(nomes);

        // Percorrendo o ArrayList
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}