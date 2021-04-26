package pacote.Atividade01;

public class Operador extends Colaborador {
	private String tipo;

	public Operador(String nome, int matricula, float salario) {
		super(nome, matricula, salario);
		this.tipo = "operador";
	}

	public float getSalario() {
		return super.getSalario() + (super.getSalario() * 0.3f);
	}

	public void imprimeCargo(){
		System.out.println("operador");
	}
}
