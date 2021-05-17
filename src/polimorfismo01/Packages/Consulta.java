package polimorfismo01.Packages;

class Consulta {
  private Cliente cliente;

  public Consulta(Cliente cliente) {
    this.cliente = cliente;
  }

  public String getNomeCliente() {
    return this.cliente.getNome();
  }
}