package heranca;

public class Professor extends Pessoa {
    public Professor(String nome, String endereco) {
        super(nome, endereco);
    }

    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public String getNomeProfessor(){
        return super.getNome();
    }

    public String getEnderecoProfessor(){
        return super.getEndereco();
    }

}
