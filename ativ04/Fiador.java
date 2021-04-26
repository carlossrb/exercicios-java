package ativ04;

public class Fiador {
    private String nome;
    private String cpf;
    private double rendaMensal;

    public Fiador(String nome, String cpf, double rendaMensal) {
        this.nome = nome;
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public void setInfosFiador(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }
}
