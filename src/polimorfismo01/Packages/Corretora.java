package polimorfismo01.Packages;

import java.util.ArrayList;

public class Corretora {
  private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
  private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
  private ArrayList<Consulta> consultas = new ArrayList<Consulta>();

  public void addCliente(String nome, int cpf, float salario, boolean empregado, boolean cargoChefia) {
    clientes.add(new Cliente(nome, cpf, salario, empregado, cargoChefia));
  }

  public void addCliente(String nome, int cpf, float salario, boolean empregado, boolean cargoChefia, float bonus) {
    clientes.add(new Cliente(nome, cpf, salario, empregado, cargoChefia, bonus));
  }

  public void listarClientes() {
    for (Cliente cliente : this.clientes) {
      System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf()
          + ", Possível valor de emprestimo: " + cliente.getValorEmprestimo());
    }
  }

  public void fazerConsulta(int cpf) {
    for (Cliente cliente : this.clientes) {
      if (cpf == cliente.getCpf()) {
        consultas.add(new Consulta(cliente));

        System.out.println("O valor do possível emprestimo do cliente é " + cliente.getValorEmprestimo());

      }
    }
  }

  public void listarConsultas() {
    System.out.println("Lista de clientes que fizeram consulta:");
    for (Consulta consulta : this.consultas) {
      System.out.println(consulta.getNomeCliente());
    }
  }

  public void fazerPedido(int cpf, float valor) {

    for (Cliente cliente : this.clientes) {
      if (cpf == cliente.getCpf()) {
        pedidos.add(new Pedido(cliente, valor));
      }
    }
  }

  public void listarPedidos() {
    for (Pedido pedido : this.pedidos) {
      pedido.getPedido();
    }
  }
}