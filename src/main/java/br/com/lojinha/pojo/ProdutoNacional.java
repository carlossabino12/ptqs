package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {

    private double impostoNacional;

    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getImpostoNacional(){

        return this.impostoNacional;
    }

    public void setImpostoNacional(double novoImpostoNacional){

        this.impostoNacional = novoImpostoNacional;
    }

    //Método que foi obrigatório implementar devido a interface Favorito que foi implementada nessa class
    public String getDadosFavoritos(){

        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
