package empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    public BigDecimal mediaAritmetica(){

        BigDecimal quociente = new BigDecimal(3);



        return this.somaTrimestral().divide(quociente, 2, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {

        Empresa trimestre = new Empresa(new BigDecimal(15000), new BigDecimal(23000), new BigDecimal(17000));

        System.out.println("A receita do trimestre é de: R$" + trimestre.somaTrimestral());
        System.out.println("A média é de: R$" + trimestre.mediaAritmetica());

    }
}
