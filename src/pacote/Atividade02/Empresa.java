package pacote.Atividade02;

import java.util.ArrayList;
import pacote.Atividade01.*;

public class Empresa {
	private ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
	private ArrayList<Operador> operadores = new ArrayList<Operador>();

	public void addGerente(String nome, int matricula, float salario) {
		this.gerentes.add(new Gerente(nome, matricula, salario));
	}

	public void addOperador(String nome, int matricula, float salario) {
		this.operadores.add(new Operador(nome, matricula, salario));
	}

	public void aumentarSalario() {
		for (Gerente gerente : this.gerentes) {
			gerente.aumentarSalario();
		}
		for (Operador operador : this.operadores) {
			operador.aumentarSalario();
		}
	}

	public void imprimeCargos() {
		for (Gerente gerente : this.gerentes) {
			gerente.imprimeCargo();
		}
		for (Operador operador : this.operadores) {
			operador.imprimeCargo();
		}
	}

}
