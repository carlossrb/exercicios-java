package polimorfismo01.Packages;

class Cliente extends Pessoa {
  private float salario;
  private boolean empregado;
  private boolean cargoChefia;
  private float valorEmprestimo;
  private float bonus;

  public Cliente(String nome, int cpf, float salario, boolean empregado, boolean cargoChefia) {
    super(nome, cpf);
    this.salario = salario;
    this.empregado = empregado;
    this.cargoChefia = cargoChefia;
    this.valorEmprestimo = calculaValorEmprestimo();
    this.bonus = 0;
  }

  public Cliente(String nome, int cpf, float salario, boolean empregado, boolean cargoChefia, float bonus) {
    super(nome, cpf);
    this.salario = salario;
    this.empregado = empregado;
    this.cargoChefia = cargoChefia;
    this.bonus = bonus;
    this.valorEmprestimo = calculaValorEmprestimo();
  }

  public float calculaValorEmprestimo() {
    if (this.empregado == false) {
      return 1000.00f;
    } else if (this.empregado && this.cargoChefia) {
      return this.salario * 2 + this.bonus;
    } else if (this.empregado) {
      return this.salario * 2;
    }
    return 0;
  }

  public float getValorEmprestimo() {
    return this.valorEmprestimo;
  }

  public String getNome() {
    return super.getNome();
  }

  public int getCpf() {
    return super.getCpf();
  }

  public float getSalario() {
    return this.salario;
  }

  public boolean getEmpregado() {
    return this.empregado;
  }

  public boolean getCargoChefia() {
    return this.cargoChefia;
  }
}