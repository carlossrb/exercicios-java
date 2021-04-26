package atv02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Beneficiario {
    private String nome;
    private String tipo;
    private String cpf_cnpj;
    private Date data_nascimento;
    private String email;
    private String telefone;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;

     /**
     * Entre com os parâmetros solicitados
     * 
     * @param nome            Nome do beneficiário
     * @param documento       documento (11 digitos CPF 14 CNPJ)
     * @param data_nascimento no formato dd/mm/yyyy
     */
    public Beneficiario(String nome, String documento, String data_nascimento) {

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
     * Add informaçoes para contato
     * @param email
     * @param telefone
     */
    public void setInfosPessoais(String email, String telefone){
        this.email = email;
        this.telefone = telefone;
    }

    /**
     * Informe os dados de endereço
     * @param rua Rua do beneficiário
     * @param numero Número da casa
     * @param complemento
     * @param bairro
     */
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

    public String isCnpj() {
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        cal.setTime(this.data_nascimento);
        int anoDoador = cal.get(Calendar.YEAR);
        int idade = anoAtual - anoDoador;
        if (tipo == "CPF") {
            return "O Beneficiário " + this.nome + (idade >= 18 ? " é maior de idade" : " é menor de idade");
        } else {
            return "O Beneficiário " + this.nome + " é uma pessoa jurídica";
        }
    }
}
