package exercícios;

public class ExerciciosMetodos {

    public static void main(String[] args) {

        mostrarMensagem();

        mostrarNome("Alonso");
    }

    static void mostrarMensagem() {
        System.out.println("Estou aprendendo métodos em Java!");
    }

    static void mostrarNome(String nome) {
        System.out.println("Olá " + nome);
    }
}