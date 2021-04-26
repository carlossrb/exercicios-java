package pacote.Atividade01;

public class Colaborador {
	private String nome;
	private int matricula;
	private float salario;

	Colaborador(String nome, int matricula, float salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void aumentarSalario() {
		this.salario += (this.salario * 0.05f);
	}

	public float getSalario() {
		return this.salario;
	}

}
