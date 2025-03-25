package TrabalhoAula03;

public class CupomVenda {
    
    // Atributos
    private String dataVenda;
    private String valor;
    private String cliente;
    private String loja;
    private String item;
    private String quantidade;

    // Contador de vendas
    public static int codigoVenda = 0;

    // Método criador
    public CupomVenda(String dataVenda, String valor, String cliente, String loja, String item, String quantidade) {
        this.dataVenda = dataVenda;
        this.valor = valor;
        this.cliente = cliente;
        this.loja = loja;
        this.item = item;
        this.quantidade = quantidade;
        codigoVenda++;
    }

    // Método para exibir o cupom de venda
    public void exibirCupomVenda() {
        System.out.println("------ Informações Cupom de Venda ------");
        System.out.println("Data da venda: " + dataVenda);
        System.out.println("Valor da venda: " + valor);
        System.out.println("Cliente: " + cliente);
        System.out.println("Loja: " + loja);
        System.out.println("Item: " + item);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Código da venda: " + codigoVenda);
    }
}
