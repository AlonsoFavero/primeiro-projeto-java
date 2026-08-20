public class ExerciciosCondicoes {

    public static void main(String[] args) {

        int idade = 20;

        // Verificando maioridade
        System.out.println(idade >= 18);
        System.out.println(idade < 18);

        boolean maiorDeIdade = idade >= 18;

        System.out.println(maiorDeIdade);

        if (maiorDeIdade) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }

        // Classificando por idade
        if (idade <= 12) {
            System.out.println("criança");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adolescente");
        }

        // Operador AND
        boolean idadeValida = idade >= 18 && idade <= 30;

        System.out.println(idadeValida);

        // Operador OR
        boolean temAutorizacao = true;

        boolean podeEntrar = idade >= 18 || temAutorizacao == true;

        System.out.println(podeEntrar);

        // Operador NOT
        boolean semAutorizacao = !temAutorizacao;

        System.out.println(semAutorizacao);
    }
}