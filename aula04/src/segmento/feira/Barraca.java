package aula04.src.segmento.feira;

import java.util.ArrayList;
import java.util.List;

public class Barraca {

    private String vendedor;
    private String codigoLicenca;
    private List<Hortifruti> catalogo;

    public boolean isAberto() {
        return aberto;
    }

    private boolean aberto;


    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public List<Hortifruti> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Hortifruti> catalogo) {
        this.catalogo = catalogo;
    }

    public String getCodigoLicenca() {
        return codigoLicenca;
    }

    public void setCodigoLicenca(String codigoLicenca) {
        this.codigoLicenca = codigoLicenca;
    }

    // metodos

    public void cadastrarProduto(Hortifruti novo) {
        if (this.catalogo == null) {
            this.catalogo = new ArrayList<Hortifruti>();
        }

        this.catalogo.add(novo);

    }


    public List<Hortifruti> listarProdutos(String nome) {

        List<Hortifruti> listaConsulta = new ArrayList<Hortifruti>();

        for (Hortifruti item : this.catalogo) {
            if (item.getNome().contains(nome)) {
                listaConsulta.add(item);
            }
        }

        return listaConsulta;
    }

    public void abrir() {
        this.aberto = true;
        System.out.println("Barraca está aberta");
    }

    public void fechar() {
        this.aberto = false;
        System.out.println("Fechamos por hoje. Agora é só amanhã.");
    }


}
