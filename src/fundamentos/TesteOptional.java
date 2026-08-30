package fundamentos;

import java.util.Optional;

public class TesteOptional {
    public static void main(String[] args){

        Optional<String> nome = Optional.of ("Alonso");
        Optional<String> nomeVazio = Optional.empty();

        System.out.println(nome);
        System.out.println(nomeVazio);
        System.out.println(nome.isPresent());
        System.out.println(nomeVazio.isPresent());
        System.out.println(nome.get());
        System.out.println(nome.orElse("Nome desconhecido"));
        System.out.println(nomeVazio.orElse("Nome desconhecido"));
        System.out.println(nomeVazio.orElseThrow());
    }
}
