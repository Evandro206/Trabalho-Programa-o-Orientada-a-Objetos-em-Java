package TrabalhoAula03;

public class Loja {

    // Atributos
    String nomeLoja;
    String cnpjLoja;
    String razaoSocialLoja;
    String enderecoLoja;

    // Contador de lojas
    public static int codigoLoja = 0;
    public static float saldoLoja = 0;

    // Método criador
    public Loja(String nomeLoja, String cnpjLoja, String razaoSocialLoja, String enderecoLoja) {
        this.nomeLoja = nomeLoja;
        this.cnpjLoja = cnpjLoja;
        this.razaoSocialLoja = razaoSocialLoja;
        this.enderecoLoja = enderecoLoja;
        codigoLoja++;
    }

    // Método para exibir informações sobre a loja
    public void exibirLoja() {
        System.out.println("------ Informações Loja ------");
        System.out.println("Nome da loja: " + nomeLoja);
        System.out.println("CNPJ da loja: " + cnpjLoja);
        System.out.println("Razão Social da loja: " + razaoSocialLoja);
        System.out.println("Endereço da loja: " + enderecoLoja);
        System.out.println("Código da loja: " + codigoLoja);
    }

    // Método para a Loja realizar uma consulta de um item
    public void consultaItem(Item itemVerificado) {
        itemVerificado.exibirItem();
    }

    // Método para a Loja realizar um aumento de estoque
    public void entradaItem(Item itemVerificado, int quantidade) {
        itemVerificado.entraProduto(quantidade);
    }

    // Método para a Loja realizar uma diminuição de estoque
    public void saidaItem(Item itemVerificado, int quantidade) {
        itemVerificado.saidaProduto(quantidade);
    }

    // Método para a Loja realizar uma alteração de quantidade de estoque
    public void setquatiItem(Item itemVerificado, int quantidade) {
        itemVerificado.setquatiProduto(quantidade);
    }

    // Método para loja realizar uma venda
    public void vendaItem(Cliente cliente, Loja loja, Carrinho carrinho) {
        String dataVenda = new Teste().dataAtual();
        CupomVenda cupomVenda = new CupomVenda(dataVenda, cliente, loja, carrinho);
        cupomVenda.exibirCupomVenda();
    }

    // Método para a Loja realizar um cadastro de venda
    public CupomVenda cadastroVenda(Cliente cliente, Loja loja, Carrinho carrinho) {
        String dataVenda = new Teste().dataAtual();
        CupomVenda cupomVenda = new CupomVenda(dataVenda, cliente, loja, carrinho);
        cupomVenda.exibirCupomVenda();
        return cupomVenda;
    }

    // Método para a Loja exibir uma venda
    public void exibeVenda(CupomVenda cupomVenda) {
        cupomVenda.exibirCupomVenda();
    }
}
