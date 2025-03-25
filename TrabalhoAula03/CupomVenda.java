package TrabalhoAula03;

import java.util.ArrayList;

public class CupomVenda {
    
    // Atributos
    private String dataVenda;
    private float valorTotal;
    private ArrayList<Item> itens = new ArrayList<>();
    private Cliente cliente;
    private Loja loja;

    // Contador de vendas
    public static int codigoVenda = 0;

    // Método criador
    public CupomVenda(String dataVenda, Cliente cliente, Loja loja, Carrinho carrinho) {
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.loja = loja;
        this.itens.addAll(carrinho.getItensCarrinho());
        codigoVenda++;
    }

    // Método para exibir o cupom de venda
    public void exibirCupomVenda() {
        System.out.println("------ Informações Cupom de Venda ------");
        cliente.exibirCliente();
        loja.exibirLoja();
        System.out.println("=".repeat(40));
        System.out.println("=".repeat(40));
        System.out.println("ITEMS:");
        for (Item item : itens) {
            System.out.println(item.getNomeProduto());
        }
        System.out.println("-".repeat(40));
        System.out.println(String.format("N° Cupom: " + codigoVenda));
        System.out.println(String.format("Data da Venda: "+ dataVenda));
        System.out.println(String.format("Total Produtos: " + itens.size()));
        System.out.println(String.format("Total: R$ %.2f", valorTotal));
        System.out.println("=".repeat(40));
        System.out.println("Obrigado pela preferência!");
        System.out.println("Volte sempre!");
    }
}


