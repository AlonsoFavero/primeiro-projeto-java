package fundamentos.enums;

public class TesteEnum {

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.SEGUNDA;

        System.out.println(dia);

        for (DiaSemana d : DiaSemana.values()) {

            System.out.println(d.ordinal());

        }

        DiaSemana diaEscolhido = DiaSemana.valueOf("SEXTA");

        System.out.println(diaEscolhido);
    }

}

enum DiaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO

}

