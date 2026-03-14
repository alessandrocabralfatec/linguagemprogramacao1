package aula02.src.segmento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fruta {


    private String nome;
    private float estoqueMaximo;
    private float estoqueMinimo;
    private float estoque;
    private float precoKg;

//construtor
    public Fruta (String nome,float precoKg, float estoque,float estoqueMinimo, float estoqueMaximo){
        this.nome = nome;
        this.estoque = estoque;
        this.precoKg=precoKg;
        this.estoqueMinimo=estoqueMinimo;
        this.estoqueMaximo=estoqueMaximo;
    }

public void abastecer(float entradaKg){
        float novoEstoque = this.estoque + entradaKg;

        if (novoEstoque > this.estoqueMaximo){
            System.out.println("Ta ficando louco? Vai apodrecer todo o estoque se voce comprar isso aqui");
        return;
        }
this.estoque = this.estoque + entradaKg;
    }

    public void vender(float entradaKg){
        float novoEstoque = this.estoque - entradaKg;

        if (novoEstoque < 0){
            System.out.println("Ta ficando louco? Você nao tem isso tudo de "+ this.nome + ". Voce so tem "+this.estoque+" KG");
            return;
        }
        this.estoque =novoEstoque;
    }

    public void perda(float entradaKg){
        float novoEstoque = this.estoque - entradaKg;

        if (novoEstoque < 0){
            System.out.println("Impossivel! Nao tem como jogar tudo isso de "+ this.nome + " fora. Voce so tem "+this.estoque+" KG no estoque");
            return;
        }

        System.out.println("Parabéns! Você acaba de jogar "+entradaKg+" Kg de "+ this.nome + " na lata de lixo");

        this.estoque =novoEstoque;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(float estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public float getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(float estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public float getEstoque() {
        return estoque;
    }

    public void setEstoque(float estoque) {
        this.estoque = estoque;
    }

    public float getPrecoKg() {
        return precoKg;
    }

    public void setPrecoKg(float precoKg) {
        this.precoKg = precoKg;
    }
}
