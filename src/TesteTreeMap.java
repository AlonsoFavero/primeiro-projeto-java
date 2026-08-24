import java.util.TreeMap;

public class TesteTreeMap {
    public static void main(String[] args){

        TreeMap<String, String> telefones = new TreeMap<>();

        telefones.put("João",  "11555555555");
        telefones.put("Alonso", "11444444444");
        telefones.put("Carlos", "11999999999");
        telefones.put("Bruno", "11777777777");

        System.out.println(telefones);
        System.out.println(telefones.firstKey());
        System.out.println(telefones.lastKey());
        System.out.println(telefones.firstEntry());
        System.out.println(telefones.lastEntry());

        telefones.remove("Bruno");

        System.out.println(telefones.containsKey("Bruno"));
        System.out.println(telefones);
    }
}
