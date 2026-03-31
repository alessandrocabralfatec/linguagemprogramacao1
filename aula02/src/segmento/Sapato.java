package aula02.src.segmento;

public class Sapato {
    private int tamanho;
    private String marca;
    private String modelo;
    private String cor;
    private Cadarco cadarco = new Cadarco();


    public Sapato(int tamanho, String marca, String modelo, String cor){
        this.tamanho = tamanho;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean experimentar(int pe){
        return pe == this.tamanho;
    }

    public void setCadarco(String cor){
      this.cadarco = new Cadarco(cor);
    }

    public Cadarco getCadarco() {
        System.out.println("Cor do cadarco e: "+this.cadarco.getCor());
        return cadarco;
    }


    private class Cadarco{
        public String cor = "Branco sem graça";

        public Cadarco (){
        }
        public Cadarco (String cor){
            this.cor = cor;
        }

        private String getCor(){
            return this.cor;
        }
    }

}

