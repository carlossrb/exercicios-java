package atv02;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import ativ03.Doacao;

public class Doador {
    private String nome;
    private String tipo;
    private String cpf_cnpj;
    private Date data_nascimento;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private ArrayList<Doacao> doacoes = new ArrayList<Doacao>(); //lista de doações do doador objeto criado

    /**
     * Entre com os parâmetros solicitados
     * 
     * @param nome            Nome do doador
     * @param documento       documento (11 digitos CPF 14 CNPJ)
     * @param data_nascimento no formato dd/mm/yyyy
     */
    public Doador(String nome, String documento, String data_nascimento) {

        this.nome = nome;
        this.cpf_cnpj = documento;
        this.tipo = documento.length() == 11 ? "CPF" : "CNPJ";

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            this.data_nascimento = sdf.parse(data_nascimento);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Add nova doação
     * @param novaDoacao
     */
    public void addDoacao(Doacao novaDoacao ){
        this.doacoes.add(novaDoacao);
    }

    /**
     * Remove doação a partir de um indice
     * @param index
     */
    public void removeDoacao(int index){
        this.doacoes.remove(index);
    }

    /**
     * Retorna a quantidade de doações feitas pelo doador
     * @return
     */
    public int getQntDoacoes(){
        return this.doacoes.size();
    }

    /**
     * Altera elemento específico de uma doação feita pelo doador
     * @param idx
     * @param novaDoacao
     */
    public void alteraDoacao(int idx, Doacao novaDoacao){
        this.doacoes.set(idx, novaDoacao);
    }

    /**
     * Lista as descrições de cada doação referente ao Doador
     */
    public void listDoacoes(){
        for (Doacao doacao: doacoes) {
            System.out.println(doacao.getDescricaoDoacao());
        }
    }

    /**
     * Retorna um arraylist de doações de um doador
     * @return
     */
    public ArrayList<Doacao> getDoacoes(){
        return this.doacoes;
    }

    /********************ATIVIDADES ANTERIORES COMEÇÂM AQUI**************************/
    public void setEndereco(String rua, int numero, String complemento, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    public String getTipoDocumento() {
        return this.cpf_cnpj.length() == 11 ? "CPF" : "CNPJ";
    }

    public String getEnderecoCompleto() {
        String endereco = this.rua + ", " + String.valueOf(this.numero) + " - " + this.bairro + ", " + this.complemento;
        return !Boolean.valueOf(endereco) ? "Endereço não informado" : endereco;
    }
    /**
     * Verifica se o doador é empresa ou pessoa física
     * @return condição do doador
     */
    public String isCnpj() {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        cal.setTime(this.data_nascimento);
        int anoDoador = cal.get(Calendar.YEAR);
        int idade = anoAtual - anoDoador;
        if (tipo == "CPF") {
            return "O doador "+ this.nome + (idade >= 18 ? " é maior de idade" : " é menor de idade");
        } else {
            return "O doador "+ this.nome + " é uma pessoa jurídica";
        }
    }

}