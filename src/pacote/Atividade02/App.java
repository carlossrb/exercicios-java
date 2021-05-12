package pacote.Atividade02;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Empresa empresa = new Empresa();

		int resposta = 0;

		for (int i = 0; i < 3; i++) {

			System.out.println("Adicione o funcionário n" + (i + 1) + ", que tipo de colaborador ele é?");
			System.out.println("1 - Gerente");
			System.out.println("2 - Operador");

			resposta = sc.nextInt();
			sc.nextLine();

			if (resposta == 1) {

				System.out.println("Digite o nome do Gerente");
				String nome = sc.nextLine();

				System.out.println("Digite a matricula do Gerente");
				String matricula = sc.nextLine();
				int matriculaInt = Integer.parseInt(matricula);

				System.out.println("Digite o salário do Gerente");
				String salario = sc.nextLine();
				float salarioF = Float.parseFloat(salario);

				empresa.addGerente(nome, matriculaInt, salarioF);
			}

			if (resposta == 2) {

				System.out.println("Digite o nome do Operador");
				String nome = sc.nextLine();

				System.out.println("Digite a matricula do Operador");
				String matricula = sc.nextLine();
				int matriculaInt = Integer.parseInt(matricula);

				System.out.println("Digite o salário do Operador");
				String salario = sc.nextLine();
				float salarioF = Float.parseFloat(salario);

				empresa.addGerente(nome, matriculaInt, salarioF);
			}

		}
		empresa.imprimeCargos();
	}
}
