package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod,  String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirTodosProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;

        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto produtoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto produtoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

}
