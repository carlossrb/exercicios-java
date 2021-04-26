package ativ04;

public class Contrato {
    private int numero;
    private double fianca;
    private double valorAluguel;
    private int mesesAluguel;
    private int mesesPagos;
    private int mesesAtraso;
    private int juros;
    private int mesesDespejo;
    private boolean situacaoContrato;
    private Fiador fiador;

    public Contrato(int numero, double valorAluguel, int mesesAluguel, int juros, int mesesDespejo, Fiador fiador) {
        this.numero = numero;
        this.valorAluguel = valorAluguel;
        this.mesesAluguel = mesesAluguel;
        this.juros = juros;
        this.mesesDespejo = mesesDespejo;
        this.fiador = fiador;
        this.situacaoContrato = podeSerFiador();

    }

    public boolean podeSerFiador() {
        if (this.fiador.getRendaMensal() > 3 * valorAluguel) {
            return true;
        } else {
            return false;
        }
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public double getValorAluguelComJuros() {
        return valorAluguel + (valorAluguel * juros);
    }

    public void setPrestacaoPaga() {
        this.mesesPagos += mesesPagos;
    }

    public boolean getOrdemDespejo() {
        if (mesesDespejo > mesesAtraso && mesesAluguel - mesesPagos > 6) {
            return true;
        }
        return false;
    }

    public void setInfosDoFiador(String nome, String cpf) {
        fiador.setInfosFiador(cpf, nome);
    }

    public void setRendaMensalDoFiador(double rendaMensal) {
        fiador.setRendaMensal(rendaMensal);
    }
}
