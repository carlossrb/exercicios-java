package ativ05;

public class Contato {
    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNewNumero(int numero) {
        this.numero = numero;
    }
}
