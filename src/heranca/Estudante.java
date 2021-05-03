package heranca;

public class Estudante extends Pessoa {
    public Estudante(String nome, String endereco) {
        super(nome, endereco);
    };

    private String nome_escola;
    private String serie;

    public void setNomeEscola(String nome_escola) {
        this.nome_escola = nome_escola;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNomeEscola() {
        return this.nome_escola;
    }

    public String getSerie() {
        return this.serie;
    }
}
