package ativ03;

import atv02.Doador;

/**
 * Doacao
 */
public class Doacao {
    private Doador doador;
    private Tipo tipo_doacao;
    private String descricao_doacao;
    private Estado estado_doacao;
    private int quantidade;
    private boolean pode_ser_entregue;

    public Doacao(Doador doador, int quantidade) {
        this.doador = doador;
        this.quantidade = quantidade;
    }

    public String getTamanhoDoacao() {
        if (quantidade < 20)
            return "pequena";
        else if (quantidade >= 20 && quantidade < 50)
            return "media";
        return "grande";
    }

    public void setTipoDeDoacao(Tipo tipo_doacao) {
        Tipo a = Tipo.valueOf("ALIMENTO");
        this.tipo_doacao = tipo_doacao;
    }

    public String getTipoDeDoacao() {
        return tipo_doacao.name();
    }

    public int getNumeroDoTipoDoacao() {
        return this.tipo_doacao.ordinal();
    }

    public void setDescricaoDoacao(String descricao_doacao) {
        this.descricao_doacao = descricao_doacao;
    }

    public String getDescricaoDoacao() {
        return this.descricao_doacao;
    }

    public String getInfosDoador() {
        return doador.isCnpj();
    }
}

enum Tipo {
    ALIMENTO(1), ROUPA(2), LIVRO(3), MOVEL(4);

    private final int val;

    private Tipo(int val) {
        this.val = val;
    }

    public int getValue() {
        return this.val;
    }

}

enum Estado {
    RUIM(1), RAZOAVEL(2), BOM(3), OTIMO(4), EXCELENTE(5);

    private final int val;

    private Estado(int val) {
        this.val = val;
    }

    public String getInfosGenerais() {
        return val == 5 ? "Poderia ser doado como novo" : "Apresenta pequenas avarias";
    }
}
