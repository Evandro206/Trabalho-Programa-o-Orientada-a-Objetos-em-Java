package TrabalhoAula03;

public class Cliente {
    
    // Atributos
	private String nomeCliente;
	private String dataCadastroCliente;
	private String cpfCnpjCliente;
    private Carrinho carrinho;

    // Contador de clientes
    public static int codigoCliente = 0;
    
    // Método criador
    public Cliente(String nomeCliente, String dataCadastroCliente, String cpfCnpjCliente) {
        this.nomeCliente = nomeCliente;
        this.dataCadastroCliente = dataCadastroCliente;
        this.cpfCnpjCliente = cpfCnpjCliente;
        codigoCliente++;
    }

    // Método para exibir informações sobre o cliente
    public void exibirCliente(){
        System.out.println("------ Informações Cliente ------");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("CPF/CNPJ: " + cpfCnpjCliente);
        System.out.println("Código: " + codigoCliente);
        System.out.println("Data do Cadastro: " + dataCadastroCliente);
    }

    // Método para o cliente realizar uma consulta de um item
    public void consultaItem(Item itemVerificado){
        itemVerificado.exibirItem();
    }

    // Método para o cliente realizar uma compra
    public void comprar(Item itemVerificado, int quantidade, Loja loja, Carrinho carrinho){
        
    }

    // Método para o cliente criar um carrinho
    public void criarCarrinho(){
        carrinho = new Carrinho();
    }

    // Método para o cliente adicionar um item ao carrinho
    public void adicionarItemCarrinho(Item item, int quantidade){
        carrinho.adicionarItem(item, quantidade);
    }

    // Método para o cliente exibir o carrinho
    public void exibirCarrinho(){
        carrinho.exibirCarrinho();
    }

    // Método para o cliente remover um item do carrinho
    public void removerItemCarrinho(Item item, int quantidade){
        carrinho.removerItem(item, quantidade);
    }

    // Método para o cliente limpar o carrinho  
    public void limparCarrinho(){
        carrinho.limparCarrinho();
    }

    // Método get para carrinho
    public Carrinho getCarrinho(){
        return carrinho;
    }
}
