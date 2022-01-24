package Exemplo_1;

public class Main {
    public static void main(String[] agrs) {
      Carro c1 = new Carro();
      c1.setAno(1999);
      c1.setAr(true);
      c1.setCor("Vermelho");
      c1.setDirecao(false);
      //c1.ligar();
      c1.setMarca("Volkswagen");
      c1.setModelo("Fusca");
      c1.setParado(true);
      //c1.setRoda(5);
      c1.aumentarVelocidade();
      c1.aumentarVelocidade();
      c1.aumentarVelocidade();
      c1.diminuirVelocidade();

      System.out.println("*****************************");
      System.out.println("Ano do carro : " + c1.getAno());
      System.out.println("Marca do carro : " + c1.getMarca());
      System.out.println("Modelo do carro : " + c1.getModelo());
      //System.out.println("Possui dieção: " + c1.getDirecao());
     // System.out.println("Possui ar: " + c1.getAr());
      System.out.println("Velocidade : " + c1.getVelocidade());
      System.out.println("Ligado : " + c1.getLigado());
      System.out.println("Cor :" + c1.getCor());

      System.out.println("*****************************" + c1.hashCode());
      
    }
}
