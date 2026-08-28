import java.util.PriorityQueue;

public class TestePriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> fila = new PriorityQueue<>();

        fila.add(30);
        fila.add(10);
        fila.add(20);

        System.out.println(fila);
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila.isEmpty());
        System.out.println(fila.poll());
    }
}