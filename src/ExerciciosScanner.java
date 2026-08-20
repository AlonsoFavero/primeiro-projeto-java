import java.util.Scanner;

public class ExerciciosScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        String nome = scanner.nextLine();

        System.out.println(nome);

        System.out.println("Digite sua idade:");

        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }

        scanner.close();
    }
}