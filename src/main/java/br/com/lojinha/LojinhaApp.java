package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {

        Produto meuProduto = new Produto("Nestle", Tamanho.PEQUENO);
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(30);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItem = new ItemIncluso("Controles", 2);
        itensInclusos.add(primeiroItem);

        ItemIncluso segundoItem = new ItemIncluso("Cabos", 3);
        itensInclusos.add(segundoItem);

        ItemIncluso terceiroItem = new ItemIncluso("Memory card", 1);
        itensInclusos.add(terceiroItem);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());
        System.out.println(itensInclusos.size());

        System.out.println("Imprimindo o Nome e Qauntidade do primeiro item da lista de itens inclusos");
        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());

        System.out.println("For imprimindo os itens da lista de itens inclusos");
        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()){

            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        //Mostrando a herança do ProdutoNacional
        ProdutoNacional meuProdutoNacional = new ProdutoNacional("JL", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getMarca());
        System.out.println(meuProdutoNacional.getImpostoNacional());

        //Mostrando a herança do ProdutoInternacional
        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("XB", Tamanho.MEDIO);
        meuProdutoInternacional.setTaxaDeImportacao(0.4589);
        System.out.println(meuProdutoInternacional.getMarca());
        System.out.println(meuProdutoInternacional.getTaxaDeImportacao());

        //Validando o novo método criado em ProdutoInternacional usando Polimorfismo
        meuProduto.setValor(30);
        meuProdutoNacional.setValor(45);
        meuProdutoInternacional.setValor(-100);//usando o polimorfismo no método setValor
    }
}

