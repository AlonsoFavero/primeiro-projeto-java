import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {

    public static void main(String[] args) {

        // HashMap usando String como chave
        HashMap<String, String> telefones = new HashMap<>();

        telefones.put("Alonso", "11999999999");
        telefones.put("Alonso", "11888888888");
        telefones.put("Carlos", "11777777777");

        System.out.println(telefones.get("Alonso"));
        System.out.println(telefones.size());

        System.out.println(telefones.containsKey("Alonso"));
        System.out.println(telefones.containsKey("João"));

        System.out.println(telefones.containsValue("11888888888"));
        System.out.println(telefones.containsValue("11111111111"));

        System.out.println(telefones.remove("Carlos"));
        System.out.println(telefones.size());

        // Adicionando Carlos novamente
        telefones.put("Carlos", "11777777777");

        // Percorrendo o HashMap
        for (Map.Entry<String, String> entrada : telefones.entrySet()) {

            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());

        }

        // HashMap usando Pessoa como chave
        HashMap<Pessoa, String> telefonesPessoas = new HashMap<>();

        Pessoa pessoa1 = new Pessoa("Alonso", 16);
        Pessoa pessoa2 = new Pessoa("Carlos", 25);
        Pessoa novaPessoa = new Pessoa("Alonso", 16);

        // Adicionando Pessoa + telefone
        telefonesPessoas.put(pessoa1, "11222222222");
        telefonesPessoas.put(pessoa2, "11333333333");

        // Testando containsKey()
        System.out.println(telefonesPessoas.containsKey(novaPessoa));
        System.out.println(telefonesPessoas.containsKey(pessoa1));
        System.out.println(telefonesPessoas.containsKey(pessoa2));

        // Testando containsValue()
        System.out.println(telefonesPessoas.containsValue("11222222222"));
        System.out.println(telefonesPessoas.containsValue("11555555555"));

        // Testando get()
        System.out.println(telefonesPessoas.get(pessoa1));
        System.out.println(telefonesPessoas.get(pessoa2));

        System.out.println(telefonesPessoas.remove(pessoa2));
        System.out.println(telefonesPessoas.containsKey(pessoa2));
        System.out.println(telefonesPessoas.size());
    }
}