package heranca;

public class EstudanteInternacional extends Estudante {
    public EstudanteInternacional(String nome, String endereco) {
        super(nome, endereco);
    }

    private String pais_de_origem;

    public String getPaisDeOrigem(){
        return this.pais_de_origem;
    }

    public void setNomeEscola(String escola){
        super.setNomeEscola(escola);
    }
}
