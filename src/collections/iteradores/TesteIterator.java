package collections.iteradores;

import java.util.ArrayList;
import java.util.Iterator;

public class TesteIterator {
    public static void main(String[] args){

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Alonso");
        nomes.add("Carlos");
        nomes.add("João");

        Iterator<String> iterator = nomes.iterator();


        while(iterator.hasNext()){

            String nome = iterator.next();

            System.out.println(nome);

            if(nome.equals("Carlos")){

                System.out.println("Carlos encontrado");

            }
        }

        while(iterator.hasNext()){

            String nome = iterator.next();

            System.out.println(nome);

          if(nome.equals("Carlos")){

              iterator.remove();

          }
        }

    }
}
