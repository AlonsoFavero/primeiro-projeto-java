import java.util.HashMap;

public class ExerciciosHashMap {

    public static void main(String[] args) {

        HashMap<String, String> pessoa = new HashMap<>();

        // Adicionando informações
        pessoa.put("nome", "Alonso");
        pessoa.put("idade", "20");

        System.out.println(pessoa);

        // Buscando um valor pela chave
        System.out.println(pessoa.get("nome"));

        // Atualizando um valor
        pessoa.put("idade", "21");

        System.out.println(pessoa);

        // Verificando se uma chave existe
        System.out.println(pessoa.containsKey("nome"));

        // Verificando se um valor existe
        System.out.println(pessoa.containsValue("Alonso"));

        // Removendo uma informação pela chave
        pessoa.remove("idade");

        System.out.println(pessoa);
    }
}