package empresa;

import java.math.BigDecimal;

public class Empresa {

    private BigDecimal janeiro;
    private BigDecimal fevereiro;
    private BigDecimal marco;

    public Empresa(BigDecimal janeiro, BigDecimal fev, BigDecimal marco){
        this.janeiro = janeiro;
        this.fevereiro = fev;
        this.marco = marco;
    }

    public BigDecimal somaTrimestral(){
        return this.janeiro.add(this.fevereiro).add(this.marco);
    }

    public BigDecimal MediaAritmetica(){

        BigDecimal quociente = new BigDecimal(3);
        return this.somaTrimestral().divide(quociente) ;
    }

    public static void main(String[] args) {
        System.out.println("teste");
    }
}
