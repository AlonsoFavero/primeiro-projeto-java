package fundamentos.estatico;

public class TesteEstatico {
    public static void main(String[] args){

        Contador objeto1 = new Contador();
        Contador objeto2 = new Contador();

        int resultado1 = objeto1.contador = 10;
        int resultado2 = objeto2.contador;
        int resultado3 = Contador.contador = 50;

        System.out.println(objeto1.contador);
        System.out.println(objeto2.contador);
        System.out.println(Contador.contador);
    }
}
