package ativ05;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    /**
     * Add contatos na agenda
     * 
     * @param contato
     */
    public void addContato(Contato contato) {
        this.contatos.add(contato);
    }

    /**
     * Remove contato pelo nome
     * 
     * @param nome
     */
    public void removePeloNome(String nome) {
        //filter method (lambda function java 8)
        contatos.removeIf(elem -> nome.equalsIgnoreCase(elem.getNome()));
    }

    /**
     * Remove contato pelo número
     * 
     * @param numero
     */
    public void removePeloNumero(int numero) {
        Iterator<Contato> it = contatos.iterator();
        while (it.hasNext()) {
            Contato i = it.next();
            if (i.getNumero() == numero) {
                it.remove();
            }
        }
    }

    /**
     * Atualiza numero do contato pelo nome dele
     * 
     * @param nome
     * @param novoNumero
     */
    public void atulizaNumeroPeloNome(String nome, int novoNumero) {
        for (Contato contato : this.contatos) {
            if (nome.equals(contato.getNome())) {
                contato.setNewNumero(novoNumero);
            }
        }
    }

    /**
     * Lista todos os contatos
     * 
     * @return
     */
    public ArrayList<Contato> listContatos() {
        return this.contatos;
    }

    /**
     * Obtém a quantidade total de contatos registrados na agenda
     */
    public int getQuantidadeContatos() {
        return this.contatos.size();
    }

}