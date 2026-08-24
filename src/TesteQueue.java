import  java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {
public static void main(String[] args){

    Queue<String> fila = new LinkedList<>();

    fila.add("Alonso");
    fila.add("Carlos");
    fila.add("João");

    System.out.println(fila.poll());
    System.out.println(fila.peek());
    fila.offer("Felipe");
    fila.poll();
    fila.poll();
    fila.poll();
    System.out.println(fila.isEmpty());
    System.out.println(fila.poll());
    System.out.println(fila);
}
}
