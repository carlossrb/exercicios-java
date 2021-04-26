import java.util.ArrayList;

import ativ03.Doacao;
import ativ05.Agenda;
import ativ05.Contato;
import atv02.Beneficiario;
import atv02.Doador;

public class Main {

    public static void main(String[] args) {
        //Testes simples
        Doador doador = new Doador("Carlos", "03957575712", "09/03/2005");
        System.out.println(doador.isCnpj()); // Menor de idade (pessoa física)
        Doador doador2 = new Doador("Érica", "0395757571163", "09/03/2005");
        System.out.println(doador2.isCnpj()); // Pessoa juridica (idade nao influencia)
        Doacao doacao = new Doacao(doador, 20);
        doador.addDoacao(doacao);
        // doador.getQntDoacoes();
        System.out.println(doador.getQntDoacoes());
        Beneficiario beneficiario = new Beneficiario("Arthur", "03957575712",
        "09/03/2000");
        System.out.println(beneficiario.isCnpj()); // Maior de idade (pessoa física)

        ArrayList<Contato> contatos = new ArrayList<Contato>();

        for (int i = 0; i < 11; i++) {
        Contato cont = new Contato(String.valueOf(i), i + 10);
        contatos.add(cont);

        }

        Agenda agenda = new Agenda();
        for (int i = 0; i < contatos.size(); i++) {
        agenda.addContato(contatos.get(i));
        }

        agenda.atulizaNumeroPeloNome("1", 543);

        for (int i = 0; i < contatos.size(); i++) {

        System.out.println(agenda.listContatos().get(1).getNumero());
        }

    }
}
