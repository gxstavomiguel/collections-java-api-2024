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

    public double calcularValorTotalEstoque(int quantidade, double preco){
        double valorTotalEstoque = 0;
        int quantidadeEstoque = 0;



    }
}
