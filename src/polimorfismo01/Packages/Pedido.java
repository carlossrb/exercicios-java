package polimorfismo01.Packages;

class Pedido {
  private Cliente cliente;
  private float valor;

  public Pedido(Cliente cliente, float valor) {
    this.cliente = cliente;
    this.valor = valor;
  }

  public void getPedido() {
    System.out.println("Nome do cliente " + cliente.getNome() + ", CPF do cliente " + cliente.getCpf()
        + ", Valor do pedido: " + this.valor);
  }
}