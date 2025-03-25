package TrabalhoAula03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Teste {
    public static void main(String[] args) {

        // Criação de um Item
        Item item1 = new Item("Arroz", 10, 5.0f);
        Item item2 = new Item("Feijão", 20, 6.0f);
        Item item3 = new Item("Macarrão", 30, 7.0f);
        /* 
        item1.exibirItem();
        item1.entraProduto(5);
        item1.exibirItem();
        item1.saidaProduto(3);
        item1.exibirItem();
        item1.setquatiProduto(20);
        item1.exibirItem();
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("");
        */

        // Criação de um Cliente
        String data = new Teste().dataAtual();
        Cliente cliente1 = new Cliente("João", data, "123.123.123.-12");
        /* 
        cliente1.exibirCliente();
        cliente1.consultaItem(item1);
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("");
        */

        // Criação de uma Loja
        Loja loja1 = new Loja("Loja 1", "12345678910", "Razão Social 1", "Rua 1");
        /* 
        loja1.exibirLoja();
        loja1.consultaItem(item1);
        loja1.entradaItem(item1, 10);
        loja1.consultaItem(item1);
        loja1.saidaItem(item1, 5);
        loja1.consultaItem(item1);
        loja1.setquatiItem(item1, 15);
        loja1.consultaItem(item1);
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("");
        */

        // Criação de um Cupom de Venda
        cliente1.criarCarrinho();
        cliente1.adicionarItemCarrinho(item1, 5);
        cliente1.adicionarItemCarrinho(item2, 10);
        cliente1.adicionarItemCarrinho(item3, 15);
        cliente1.adicionarItemCarrinho(item1, 5);
        cliente1.carrinho.getQuantidadeItem(item1);
        CupomVenda Venda = loja1.cadastroVenda(cliente1, loja1, cliente1.getCarrinho());
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("");
    }

    // Método para obter a data atual
    public String dataAtual() {
        LocalDateTime agora = LocalDateTime.now(); // Obtém a data e hora atuais
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Define o formato desejado
        String dataFormatada = agora.format(formatter); // Formata a data
        return dataFormatada; // Retorna a data formatada
    }
}
