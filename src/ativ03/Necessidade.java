package ativ03;

import atv02.Beneficiario;

/**
 * Necessidade
 */
public class Necessidade {
    private Beneficiario beneficiario;
    private Tipo tipo_necessidade;
    private String descricao_necessidade;
    private int quantidade;

    public Necessidade(Beneficiario beneficiario, Tipo tipo_necessidade, String descricao_necessidade, int quantidade) {
        this.beneficiario=beneficiario;
        this.tipo_necessidade=tipo_necessidade;
        this.descricao_necessidade=descricao_necessidade;
        this.quantidade=quantidade;
    }

    public String getDescricao(){
       return descricao_necessidade;
    }
}
