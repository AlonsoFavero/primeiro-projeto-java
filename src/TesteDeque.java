import java.util.Deque;
import java.util.LinkedList;

public class TesteDeque {
    public static void main(String[] args){

        Deque<String> deque = new LinkedList<>();

        deque.addFirst("Alonso");
        deque.addLast("Carlos");
        deque.addLast("Felipe");

        System.out.println(deque.removeFirst());

        System.out.println(deque);

        System.out.println(deque.removeLast());

        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque);

        System.out.println(deque.offerFirst("Maria"));
        System.out.println(deque.offerLast("Pedro"));

        System.out.println(deque);

        System.out.println(deque.isEmpty());

        deque.removeFirst();
        deque.removeFirst();
        deque.removeFirst();

        System.out.println(deque);
    }
}
