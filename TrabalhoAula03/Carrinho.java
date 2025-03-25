package TrabalhoAula03;

import java.util.ArrayList;

public class Carrinho {
    // Atributos
    private ArrayList<Item> itensCarrinho = new ArrayList<>();
    private int quantidadeItens = 0;
    private float valorTotal = 0;
    
    // Método para adicionar um item ao carrinho
    public void adicionarItem(Item item, int quantidade) {
        this.itensCarrinho.add(item);
        this.quantidadeItens = quantidade;
        valorTotal += (item.getPrecoItem() * quantidade);
    }

    // Método para exibir o carrinho
    public void exibirCarrinho() {
        System.out.println("------ Carrinho ------");
        for (Item item : itensCarrinho) {
            item.exibirItem();
        }
        System.out.println("Quantidade de itens: " + quantidadeItens);
        System.out.println("Valor total: " + valorTotal);
    }

    // Método para remover um item do carrinho
    public void removerItem(Item item, int quantidade) {
        this.itensCarrinho.remove(item);
        this.quantidadeItens -= quantidade;
        valorTotal -= (item.getPrecoItem() * quantidade);
    }
}