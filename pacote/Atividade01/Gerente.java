package pacote.Atividade01;

public class Gerente extends Colaborador {
	private String tipo;

	public Gerente(String nome, int matricula, float salario) {
		super(nome, matricula, salario);
		this.tipo = "gerente";
	}

	public float getSalario() {
		return super.getSalario() + (super.getSalario() * 0.1f);
	}

	public void imprimeCargo(){
		System.out.println("gerente");
	}
}
