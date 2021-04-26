package prova01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Linha
 */
class Linha {
    private String codigo;
    private String cidade_partida;
    private String cidade_destino;
    private String horario_saida;
    private int distancia;
    private ArrayList<Onibus> onibus = new ArrayList<Onibus>();

    /**
     * Primeiro caso para cadastro de uma linha de onibus
     * 
     * @param cidade_partida
     * @param cidade_destino
     * @param horario_saida
     * @param distancia
     */
    public Linha(String codigo, String cidade_partida, String cidade_destino, String horario_saida, int distancia) {
        this.cidade_destino = cidade_destino;
        this.cidade_partida = cidade_partida;
        this.distancia = distancia;
        this.horario_saida = horario_saida;
        this.codigo = codigo;
    }

    /**
     * Segundo caso para cadastro de uma linha de onibus
     * 
     * @param codigo
     * @param cidade_partida
     * @param cidade_destino
     */
    public Linha(String codigo, String cidade_partida, String cidade_destino) {
        this.cidade_destino = cidade_destino;
        this.cidade_partida = cidade_partida;
        this.codigo = codigo;
    }

    /**
     * Add um ônibus na linha, verificando se ele ja existe
     * 
     * @param onibus
     */
    public void addOnibusToLine(Onibus onibus) {
        boolean exist = false;
        for (Onibus bus : this.onibus) {
            if (onibus.equals(bus))
                exist = true;
        }
        if (!exist)
            this.onibus.add(onibus);
    }

    /**
     * Remove um onibus caso seja encontrado
     * 
     * @param onibus
     * @return
     */
    public boolean removeOnibus(Onibus onibus) {
        Iterator<Onibus> it = this.onibus.iterator();
        while (it.hasNext()) {
            Onibus bus = it.next();
            if (onibus.equals(bus)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * Remove um onibus pela placa caso seja encontrado
     * 
     * @param placa
     * @return
     */
    public boolean removeOnibus(String placa) {
        Iterator<Onibus> it = this.onibus.iterator();
        while (it.hasNext()) {
            Onibus bus = it.next();
            if (placa.equals(bus.getPlaca())) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * Imprime os dados da linha e a quantidade de onibus
     */
    public void printLineInfos() {
        System.out.println("------- Os dado gerais da linha são:\n");

        System.out.printf("O código da linha: %s", this.codigo);
        System.out.printf("A cidade de partida: %s", this.cidade_partida);
        System.out.printf("A cidade de destino: %s", this.cidade_destino);
        System.out.printf("O horário de saída: %s", this.horario_saida);
        System.out.printf("A distãncia em Km: %i", this.distancia);
        System.out.printf("A quantdade de ônibus total dessa linha é: %i", this.onibus.size());

    }

    /**
     * Imprime dados de onibus ativos e inativos
     */
    public void printOnibusInfos() {
        System.out.println("------- Os dados gerais dos ônibus são:\n");
        for (Onibus bus : this.onibus) {
            bus.printOnibusInfos();
        }
    }

    /**
     * Filtra por status dos onibus
     * @param status
     */
    public void printOnibusInfos(boolean status) {
        System.out.println("------- Os dado filtrados dos ônibus são:\n");
        for (Onibus bus : this.onibus) {
            if (status) {
                if(bus.getStatus()) bus.printOnibusInfos(); //imprime os ativos
            } else {
                if(!bus.getStatus()) bus.printOnibusInfos(); //imprime os inativos
            }
        }
    }
}

/**
 * Onibus
 */
class Onibus {
    private String placa;
    private int capacidade;
    private Date ultima_revisao;
    private String nome_motorista;
    private String horario_saida;
    private Status status;

    /**
     * Primeira forma de cadastrar um onibus (todos os dados informados)
     * 
     * @param placa
     * @param capacidade
     * @param ultima_revisao
     * @param nome_motorista
     * @param horario_saida
     * @param status
     */
    public Onibus(String placa, int capacidade, Date ultima_revisao, String nome_motorista, String horario_saida,
            Status status) {
        this.placa = placa;
        this.capacidade = capacidade;
        this.ultima_revisao = ultima_revisao;
        this.nome_motorista = nome_motorista;
        this.horario_saida = horario_saida;
        this.status = status;

    }

    /**
     * Segunda forma de cadastrar um onibus (Sem motorista e status com inativo)
     * 
     * @param placa
     * @param capacidade
     * @param ultima_revisao
     * @param horario_saida
     */
    public Onibus(String placa, int capacidade, Date ultima_revisao, String horario_saida) {
        this.placa = placa;
        this.capacidade = capacidade;
        this.ultima_revisao = ultima_revisao;
        this.horario_saida = horario_saida;
        this.status = Status.valueOf("INATIVO");

    }

    /**
     * Obtém a placa do onibus instanciado
     * 
     * @return
     */
    public String getPlaca() {
        return this.placa;
    }

    /**
     * Imprime infos gerais de um onico onibus
     */
    public void printOnibusInfos() {
        // formata date -> string
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        String strDate = dateFormat.format(this.ultima_revisao);

        System.out.printf("A placa do ônibus: %s", this.placa);
        System.out.printf("O nome do motorista: %s", this.nome_motorista);
        System.out.printf("O horário de saída: %s", this.horario_saida);
        System.out.printf("O status: %s", this.status.name());
        System.out.printf("A data da ultima revisão: %s", strDate);
        System.out.printf("A capcidade total: %i", this.capacidade);
        System.out.println("\n");

    }

    /**
     * Obtem o status atual do onibus
     * 
     * @return
     */
    public boolean getStatus() {
        return this.status.name() == "INATIVO" ? false : true;
    }

}

/**
 * Status do ônibus (ativo=true, inativo=false)
 */
enum Status {
    ATIVO(0), INATIVO(1);

    private final int val;

    private Status(int val) {
        this.val = val;
    }
}