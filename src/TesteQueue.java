import java.util.Queue;
import java.util.LinkedList;

public class TesteQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        Queue<Integer> numeros = new LinkedList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros);

        System.out.println(numeros.poll());

        System.out.println(numeros);

        System.out.println(numeros.peek());
        System.out.println(numeros.isEmpty());

        // Adicionando pessoas
        fila.add("Alonso");
        fila.add("Carlos");
        fila.add("João");

        System.out.println(fila);

        // Remove o primeiro
        System.out.println(fila.poll());
        System.out.println(fila);

        // Consulta o primeiro sem remover
        System.out.println(fila.peek());
        System.out.println(fila);

        // Adiciona uma nova pessoa
        fila.offer("Felipe");
        System.out.println(fila);

        // Verifica se a fila está vazia
        System.out.println(fila.isEmpty());

        // Consulta o primeiro usando element()
        System.out.println(fila.element());
        System.out.println(fila);

        // Remove o primeiro usando remove()
        System.out.println(fila.remove());
        System.out.println(fila);

    }
}