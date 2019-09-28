package app;

public class Pessoa {

  private int id;
  private String nome;
  private String email;

  public Pessoa(){
    }

  public Pessoa(String pPessoa){
    this.nome = pPessoa;
}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void Andar(){
    System.out.println("O (a) "+this.getNome()+" está andando");
  }

  public void Falar(){
    System.out.println("O (a) "+this.getNome()+" está falando");
  }

  public void Correr(){
    System.out.println("O (a) "+this.getNome()+" está correndo");
  }

  public void Parar(){
    System.out.println("O (a) "+this.getNome()+" está parado (a)");
  }

}