package app;

public class Vendedor extends Pessoa{

  private String cargo;
  private double salario;


  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public Vendedor(){
  }

  public Vendedor(String cargo, double salario){
    super();
    this.cargo = cargo;
    this.salario = salario;
  }

  public String Vender(Pessoa p){

    return "O (a) vendedor "+this.getNome()+" vendeu um produto para "+p.getNome();
  }
}