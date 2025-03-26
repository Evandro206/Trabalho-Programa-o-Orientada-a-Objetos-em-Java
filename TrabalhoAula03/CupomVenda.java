package TrabalhoAula03;

import java.util.ArrayList;

public class CupomVenda {
    
    // Atributos
    private String dataVenda;
    private ArrayList<Informacao> itens = new ArrayList<>();
    private Cliente cliente;
    private Carrinho carrinho;
    private Loja loja;

    // Contador de vendas
    public static int codigoVenda = 0;

    // Método criador
    public CupomVenda(String dataVenda, Cliente cliente, Loja loja, Carrinho carrinho) {
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.loja = loja;
        this.carrinho = carrinho;
        this.itens.addAll(carrinho.getItensCarrinho());
        codigoVenda++;
    }

    // Método para exibir o cupom de venda
    public void exibirCupomVenda() {
        System.out.println("====== Informações Cupom de Venda ======");
        cliente.exibirCliente();
        loja.exibirLoja();
        System.out.println("=".repeat(40));
        System.out.println("=".repeat(40));
        System.out.println("ITEMS:");
        for (Informacao info : itens) {
            System.out.println(String.format("%-20s %2dun R$ %.2f", info.item.getNomeProduto(), info.quantidade, info.item.getPrecoItem()));
        }
        System.out.println("-".repeat(40));
        System.out.println(String.format("N° Cupom: " + codigoVenda));
        System.out.println(String.format("Data da Venda: "+ dataVenda));
        System.out.println(String.format("Total Produtos: " + itens.size()));
        System.out.println(String.format("Total: R$ %.2f", carrinho.getValorTotal()));
        System.out.println("=".repeat(40));
        System.out.println("Obrigado pela preferência!");
        System.out.println("Volte sempre!");
    }
}