package TrabalhoAula03;

public class Item {
    
    // Atributos
	private String nomeProduto;
	private int quantidadeProduto;
	private float valorProduto;

    // Contador de produtos
    public static int codigoProduto = 0;
    
    // Método criador
    public Item(String nomeProduto, int quantidadeProduto, float valorProduto) {
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
        codigoProduto++;
    }

    // Método para exibir o item
    public void exibirItem() {
        System.out.println("------ Informações Produto ------");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Código do produto: " + codigoProduto);
        System.out.println("Quantidade do produto: " + quantidadeProduto);
        System.out.println("Valor do produto: " + valorProduto);
    }

    // Método de aumento da quantidade de produtos
    public void entraProduto(int quantidadeProduto) {
        this.quantidadeProduto += quantidadeProduto;
    } 

    // Método de diminuição da quantidade de produtos
    public void saidaProduto(int quantidadeProduto) {
        this.quantidadeProduto -= quantidadeProduto;
    }

    // Método set para quantidade de produtos
    public void setquatiProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
}
