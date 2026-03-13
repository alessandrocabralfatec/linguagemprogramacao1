package escola;

public class Aluno {
//max(
// (${nota_individual}*0.5)   //50% da nota
// + ${passouNotaCorte} *(API*0.5)          (50%)
//   ,
//   EXF
// )

    private double P1 = 0;
    private double E1 = 0;
    private double E2 = 0;
    private double X = 0; // gincana
    private double SUB = 0;
    private double API = 0;
    private double EXF = 0; //teste


    private static double PESO_NOTA_FINAL = 0.5;
    private static double PESO_NOTA_API = 0.5;
    private static double PESO_P1 = 0.5;
    private static double PESO_E1 = 0.2;
    private static double PESO_E2 = 0.3;
    private static double PESO_SUB = 0.15;
    private static double NOTA_CORTE = 5.9;

    // esta função valida se uma determinada nota está entre 0 a 10.
    private static boolean notaInvalida(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Valor [" + nota + "] inserido é inválido");
            return true;
        }
        return false;
    }

    public double getP1() {
        return P1;
    }

    public void setP1(double in) {
        if (notaInvalida(in)) {
            return;
        }

        this.P1 = in;
    }

    public double getE1() {
        return E1;
    }

    public void setE1(double in) {
        if (notaInvalida(in)) {
            return;
        }

        this.E1 = in;
    }

    public double getE2() {
        return E2;
    }

    public void setE2(double in) {
        if (notaInvalida(in)) {
            return;
        }

        this.E2 = in;
    }

    public double getX() {
        return X;
    }

    public void setX(double in) {
        if (notaInvalida(in)) {
            return;
        }

        this.X = in;
    }

    public double getSUB() {
        return SUB;
    }

    public void setSUB(double in) {
        if (notaInvalida(in)) {
            return;
        }

        this.SUB = in;
    }

    public double getAPI() {
        return API;
    }

    public void setAPI(double in) {
        if (notaInvalida(in)) {
            return;
        }

        this.API = in;
    }

    public double getEXF() {
        return EXF;
    }

    public void setEXF(double in) {
        if (notaInvalida(in)) {
            return;
        }

        this.EXF = in;
    }

    public double getNotaIndividual() {
        // TODO perguntar:
        // tem regra para fazer a SUB, ou pode fazer a gosto para ganhar mais nota? Qual é a regra pra fazer a sub. Posso terminar o semestre com 12?

        return (this.P1 * PESO_P1) + (this.E1 * PESO_E1) + (this.E2 * PESO_E2) + (this.X) + (this.SUB * PESO_SUB);
    }

    public double getPassouNotaCorte() {

        boolean aboveOfCutNote = (this.getNotaIndividual() - NOTA_CORTE) > 0;
        if (aboveOfCutNote) {
            return 1;
        }

        return 0;
    }

    public double getNotaFinal() {
        double NotaIndividualPeso = (this.getNotaIndividual() * PESO_NOTA_FINAL);
        double NotaApiPeso = (this.getPassouNotaCorte()) * (this.API * PESO_NOTA_API);

        double notaFinal = NotaIndividualPeso + NotaApiPeso;

        return Math.max(notaFinal, this.EXF);

    }

}
