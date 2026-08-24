import java.util.LinkedHashMap;

public class TesteLinkedHashMap {
    public static void main(String[] args){

        LinkedHashMap<String, String> telefones = new LinkedHashMap<>();

        telefones.put("Alonso", "11444444444");
        telefones.put("Carlos", "11666666666");
        telefones.put("João",  "11555555555");

        telefones.remove("Carlos");

        telefones.put("Carlos", "11666666666");
        telefones.put("Alonso", "11888888888");

        System.out.println(telefones);
        System.out.println(telefones.containsKey("Alonso"));
        System.out.println(telefones.containsKey("Maria"));
        System.out.println(telefones.get("Alonso"));

    }
}
