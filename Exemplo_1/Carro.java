package Exemplo_1;

public class Carro {
    // Atibutos
    private String cor;
    private String modelo;
    private String marca;
    private int roda = 4;
    private int ano;
    private boolean ar;
    private boolean direcao;
    private boolean ligado;
    private float velocidade;
    private boolean parado;
    
    //operacoes ou metodos
    public void setCor(String pCor){
        this.cor = pCor;
    }

    public String getCor(){
        return this.cor;
    }

    public boolean getParado() {
        return parado;
    }

    public void setParado(boolean parado) {
        this.parado = parado;
    }

    public float getVelocidade() {
        return velocidade;
    }

    private void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getDirecao() {
        return direcao;
    }

    public void setDirecao(boolean direcao) {
        this.direcao = direcao;
    }

    public  boolean getAr() {
        return ar;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getRoda() {
        return roda;
    }

    //public void setRoda(int roda) {
      //  this.roda = roda;
    //}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   // ---------------------------

    public void aumentarVelocidade() {
        this.setVelocidade(this.velocidade + 10);
    }

    public void diminuirVelocidade(){
        this.setVelocidade(this.velocidade - 10);
    }
  
    void andar() {
  
    }
  
    void parar() {
  
    }
  
    void colocarAr() {
  
    }
  
    public void ligar() {
        if(!getLigado())
            this.setLigado(true);
    }
  
    public void desliga() {
        if(getLigado())
            this.setLigado(false);
    }
  
    void idade() {
  
    }
}