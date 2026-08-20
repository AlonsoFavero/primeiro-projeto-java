public class ExerciciosWhile {

    public static void main(String[] args) {

        // Contando de 1 até 5
        int contador = 1;

        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // Contando de 10 até 1
        contador = 10;

        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }

        // Pulando de 2 em 2
        contador = 2;

        while (contador <= 10) {
            System.out.println(contador * 2);
            contador++;
        }
    }
}