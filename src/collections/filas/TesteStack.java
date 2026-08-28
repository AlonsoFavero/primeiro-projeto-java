package collections.filas;

import java.util.Stack;

public class TesteStack {
    public static void main(String[] args){

        Stack<String> pilha = new Stack<>();

        pilha.push("Alonso");
        pilha.push("Carlos");
        pilha.push("João");

        System.out.println(pilha);

        System.out.println(pilha.pop());

        System.out.println(pilha);

        System.out.println(pilha.peek());

        System.out.println(pilha.isEmpty());

        System.out.println(pilha.pop());
        System.out.println(pilha.pop());

        System.out.println(pilha);
        System.out.println(pilha.isEmpty());

    }
}
