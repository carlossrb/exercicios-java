package polimorfismo01;

import polimorfismo01.Packages.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Corretora corretora = new Corretora();

        int i = 1;

        while (i > 0) {

            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Listar clientes");

            System.out.println("3 - Fazer Consulta");
            System.out.println("4 - Listar clientes que fizeram consultas");

            System.out.println("5 - Fazer pedido");
            System.out.println("6 - Listar Pedidos");

            System.out.println("7 - Sair da aplicação");

            int resposta = sc.nextInt();
            sc.nextLine();

            if (resposta == 1) {
                System.out.println("Digite o nome do cliente");
                String nome = sc.nextLine();

                System.out.println("Digite o CPF do cliente");
                String string_cpf = sc.nextLine();
                int cpf = Integer.parseInt(string_cpf);

                System.out.println("O cliente está empregado? Digite '1' para Sim ou '2' para Não");
                int empregado = sc.nextInt();
                sc.nextLine();

                if (empregado == 2) {
                    corretora.addCliente(nome, cpf, 0.00f, false, false);
                }
                if (empregado == 1) {
                    System.out.println("Digite o salário do Cliente");

                    String string_salario = sc.nextLine();
                    float salario = Float.parseFloat(string_salario);

                    System.out.println("O cliente tem cargo de Chefia? Digite '1' para Sim ou '2' para Não");
                    String string_chefe = sc.nextLine();
                    int chefe = Integer.parseInt(string_chefe);

                    if (chefe == 2) {
                        corretora.addCliente(nome, cpf, salario, true, false);
                    } else if (chefe == 1) {
                        System.out.println("Digite o valor do seu bônus");
                        String string_bonus = sc.nextLine();
                        float bonus = Float.parseFloat(string_bonus);
                        corretora.addCliente(nome, cpf, salario, true, true, bonus);
                    }
                }
            }

            else if (resposta == 2) {
                corretora.listarClientes();
            } else if (resposta == 3) {
                System.out.println("Digite o cpf do cliente que gostaria de consultar");
                String string_CpfConsulta = sc.nextLine();
                int cpfConsulta = Integer.parseInt(string_CpfConsulta);

                corretora.fazerConsulta(cpfConsulta);
            } else if (resposta == 4) {
                corretora.listarConsultas();
            } else if (resposta == 5) {
                System.out.println("Digite o cpf do cliente que gostaria de fazer o pedido");
                String cpf_cliente_pedido = sc.nextLine();
                int cpf_pedido = Integer.parseInt(cpf_cliente_pedido);

                System.out.println("Digite o valor do pedido que gostara de fazer");
                String string_valor_pedido = sc.nextLine();
                float valor_pedido = Float.parseFloat(string_valor_pedido);

                corretora.fazerPedido(cpf_pedido, valor_pedido);
                System.out.println("Seu pedido foi registrado!");
            } else if (resposta == 6) {
                corretora.listarPedidos();
            } else if (resposta == 7) {
                break;
            }
        }

    }
}
