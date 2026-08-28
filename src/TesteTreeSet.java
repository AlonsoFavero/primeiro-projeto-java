import java.util.TreeSet;
import java.util.HashSet;

public class TesteTreeSet {
    public static void main(String[] args){
        TreeSet<Integer> numeros = new TreeSet<>();
        HashSet<Integer> numerosHash = new HashSet<>();

        numerosHash.add(30);
        numerosHash.add(10);
        numerosHash.add(20);

        numeros.add(30);
        numeros.add(10);
        numeros.add(20);
        numeros.add(20);

        System.out.println(numerosHash);
        System.out.println(numeros);
        numeros.remove(10);
        System.out.println(numeros);
        System.out.println(numeros.contains(20));
        System.out.println(numeros.contains(50));
        System.out.println(numeros.isEmpty());
    }
}
