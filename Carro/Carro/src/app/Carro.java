package app;

public class Carro {

  public Carro() {
    this.movimento = false;
  }

  public Carro(String pCliente) {
    this.dono = pCliente;
    this.movimento = false;
  }

  private String dono;
  private String Modelo;
  private String Cor;
  private boolean movimento;

  public boolean isMovimento() {
    return movimento;
  }

  public void setMovimento(boolean movimento) {
    this.movimento = movimento;
  }

  public String getDono(){
    return this.dono;
  }

  public String getModelo() {
    return Modelo;
  }

  public String getCor() {
    return Cor;
  }

  public void setCor(String cor) {
    this.Cor = cor;
  }

  public void setModelo(String modelo) {
    this.Modelo = modelo;
  }

  public void CaracteristicasDoCarro(){
    System.out.println("Carro do "+ this.getDono() +" Modelo: "+ this.getModelo() + " Cor: "+ this.getCor() + " - Está em movimento: "+ (this.isMovimento() ? "Sim" : "Não"));
  }

  public void CaracteristicasDoCarro(Carro carro){
    System.out.print("O dono do Carro é: "+ carro.dono);
  }
  
  public void Movimentar(boolean pMovimento){
    this.movimento = pMovimento;
  }

}