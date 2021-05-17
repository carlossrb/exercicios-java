package polimorfismo01.Packages;
class Pessoa{
  private String nome;
  private int cpf;

  public Pessoa(String nome, int cpf){
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getNome(){
    return this.nome;
  }
  public int getCpf(){
    return this.cpf;
  }
}