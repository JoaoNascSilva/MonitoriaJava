package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        Carro CarroDoJoao = new Carro("João");
        CarroDoJoao.setCor("Vermelho");
        CarroDoJoao.setModelo("Gol");
        CarroDoJoao.CaracteristicasDoCarro();
        Pessoa p = new Pessoa("João");
        Vendedor v = new Vendedor();
        
        CarroDoJoao.setCor("Prata");        
        CarroDoJoao.Movimentar(true);
        CarroDoJoao.CaracteristicasDoCarro();

        Carro CarroDoCleber = new Carro("Cleber");
        CarroDoCleber.setCor("Azul");
        CarroDoCleber.setModelo("Corola");
        CarroDoCleber.CaracteristicasDoCarro();
        CarroDoCleber.setCor("Preto");
        CarroDoCleber.CaracteristicasDoCarro();

        CarroDoJoao.Movimentar(false);
        CarroDoJoao.CaracteristicasDoCarro();

        CarroDoJoao.CaracteristicasDoCarro(CarroDoJoao);

        p.Andar();
        p.Falar();
        p.Correr();
        p.Parar();

        v.setNome("Fábio");

        System.out.println(v.Vender(p));

    }
}