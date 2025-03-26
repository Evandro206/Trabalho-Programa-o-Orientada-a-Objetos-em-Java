package TrabalhoAula03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Caixa {

    // Declaração do Scanner como variável de instância
    private static final Scanner scanner = new Scanner(System.in); // Scanner para leitura de dados
    private static ArrayList<Loja> lojas = new ArrayList<>(); // Lista de lojas
    private static boolean continuar = true; // Variável para controlar o loop

    public static void main(String[] args) {
        lojas.addAll(Testes.main(new String[0]));
        while (continuar) {
            String oqueFazer = exibirMenuLoja();
            switch (oqueFazer) {
                case "1":
                    lojas.add(Loja.cadastrarLoja(scanner));
                    continuar = perguntarContinuar(); // Uso correto do método perguntarContinuar
                    break;
                case "2":
                    System.out.println("====== Lista de Lojas ======");
                    for (Loja loja : lojas) {
                        loja.exibirLoja();
                    }
                    continuar = perguntarContinuar(); // Uso correto do método perguntarContinuar
                    break;
                case "3":
                    selecionarLoja(); // Implementação do método de selecionar loja
                    break;
                case "4":
                    System.out.println("Saindo...");
                    scanner.close(); // Fecha Scanner ao sair do programa
                    return; // Finaliza o programa
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    // Método para obter data
    public static String dataAtual() {
        LocalDateTime agora = LocalDateTime.now(); // Obtém a data e hora atuais
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Define o formato desejado
        return agora.format(formatter); // Retorna a data formatada
    }

    // Método para gerar continuidade do código
    public static boolean perguntarContinuar() {
        while (true) {
            try {
                System.out.println("Deseja continuar? (S/N)");
                String simNao = scanner.nextLine().trim().toUpperCase(); // Remove espaços extras e transforma em
                                                                         // maiúsculo
                if (simNao.equals("N")) {
                    return false;
                } else if (simNao.equals("S")) {
                    return true;
                } else {
                    System.out.println("Opção inválida! Digite 'S' ou 'N'.");
                }
            } catch (Exception e) { // Captura qualquer exceção inesperada
                System.out.println("Erro inesperado: " + e.getMessage());
                return false;
            }
        }
    }

    // Método para exibir menu
    public static String exibirMenuLoja() {
        System.out.println("====== Sistema Unificado de Caixa ======");
        System.out.println("============== Bem Vindo! ==============");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar Loja");
        System.out.println("2 - Listar Lojas");
        System.out.println("3 - Selecionar Loja");
        System.out.println("4 - Sair");
        return scanner.nextLine(); // Retorna a opção escolhida
    }

    // Método para buscar loja
    public static void selecionarLoja() {
        if (lojas.isEmpty()) {
            System.out.println("Nenhuma loja cadastrada!");
            return;
        }
        System.out.println("Escolha uma loja pelo índice:");
        for (int i = 0; i < lojas.size(); i++) {
            System.out.println(i + " - " + lojas.get(i).getNomeLoja()); // Exibe os nomes das lojas
        }
        try {
            int indice = Integer.parseInt(scanner.nextLine().trim()); // Lê o índice escolhido
            if (indice < 0 || indice >= lojas.size()) {
                System.out.println("Índice inválido.");
            } else {
                Loja lojaSelecionada = lojas.get(indice);
                System.out.println("Loja selecionada: " + lojaSelecionada.getNomeLoja());
                // Aqui você pode adicionar mais operações para a loja selecionada
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Por favor, insira um número.");
        }
    }

    // Método auxiliar que busca a loja pelo CNPJ
    public static Loja buscarLojaPorCNPJ(String cnpjPesquisa) {
        for (Loja loja : lojas) {
            if (loja.cnpjLoja.equals(cnpjPesquisa)) {
                return loja; 
            }
        }
        return null;
    }

    // Método que interage com o usuário para selecionar a loja pelo CNPJ
    public static void selecionarLojaPorCNPJ() {
        System.out.println("Digite o CNPJ da loja que deseja selecionar:");
        String cnpjPesquisa = scanner.nextLine().trim();
        Loja lojaEncontrada = buscarLojaPorCNPJ(cnpjPesquisa);
        if (lojaEncontrada != null) {
            System.out.println("Bem Vindo a Loja: " + lojaEncontrada.getNomeLoja() + "!");
        } else {
            System.out.println("Nenhuma loja encontrada com o CNPJ informado.");
        }
    }
}