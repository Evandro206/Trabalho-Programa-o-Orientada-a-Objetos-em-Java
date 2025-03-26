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
        String oqueFazer;
        while (continuar) {
            oqueFazer = exibirMenuLoja();
            switch (oqueFazer) {
                case "1":
                    lojas.add(Loja.cadastrarLoja(scanner));
                    continuar = perguntarContinuar();
                    break;
                case "2":
                    System.out.println("====== Lista de Lojas ======");
                    for (Loja loja : lojas) {
                        loja.exibirLoja();
                    }
                    continuar = perguntarContinuar();
                    break;
                case "3":
                    System.out.println("Você deseja selecionar a loja pelo Índice ou pelo CNPJ?");
                    System.out.println("Digite '1' para Índice ou '2' para CNPJ:");
                    String escolha = scanner.nextLine();

                    Loja lojaSelecionada = null;
                    if (escolha.equals("1")) {
                        // Método já implementado para seleção por índice
                        lojaSelecionada = selecionarLoja();
                        ;
                    } else if (escolha.equals("2")) {
                        // Método já implementado para seleção por CNPJ
                        lojaSelecionada = selecionarLojaPorCNPJ();
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    if (lojaSelecionada != null) {
                        System.out.println("=== Bem vindo ao caixa da loja " + lojaSelecionada.getNomeLoja());
                        oqueFazer = exibirMenuCliente();
                        switch (oqueFazer) {
                            case "1":
                                Cliente novoCliente = Cliente.cadastrarCliente(scanner);
                                if (novoCliente != null) {
                                    lojaSelecionada.adicionarCliente(novoCliente);
                                    System.out.println("Cliente cadastrado com sucesso!");
                                } else {
                                    System.out.println("Falha ao cadastrar cliente.");
                                }
                                break;
                            case "2":
                                System.out.println("====== Lista de Clientes ======");
                                for (Cliente cliente : lojaSelecionada.getClientes()) {
                                    cliente.exibirCliente();
                                }
                                break;
                            case "3":
                                System.out.println("Digite o CPF do cliente que deseja selecionar:");
                                String cpfPesquisa = scanner.nextLine().trim();
                                Cliente clienteEncontrado = lojaSelecionada.buscarClientePorCPF(cpfPesquisa);
                                if (clienteEncontrado != null) {
                                    System.out.println("Cliente selecionado: " + clienteEncontrado.getNomeCliente());
                                } else {
                                    System.out.println("Nenhum cliente encontrado com o CPF informado.");
                                }
                                break;
                            case "4":
                                System.out.println("Voltando ao menu anterior...");
                                return;
                            case "5":
                                System.out.println("Saindo...");
                                scanner.close();
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    }
                    continuar = perguntarContinuar();
                    break;
                case "4":
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
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
        return scanner.nextLine();
    }

    public static String exibirMenuCliente() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Listar Clientes");
        System.out.println("3 - Selecionar Cliente");
        System.out.println("4 - Voltar ao Menu Anterior");
        System.out.println("5 - Sair");
        return scanner.nextLine();
    }

    // Método para buscar loja
    public static Loja selecionarLoja() {
        if (lojas.isEmpty()) {
            System.out.println("Nenhuma loja cadastrada!");
            return null;
        }
        System.out.println("Escolha uma loja pelo índice:");
        for (int i = 0; i < lojas.size(); i++) {
            System.out.println(i + " - " + lojas.get(i).getNomeLoja());
        }
        Loja lojaSelecionada = null;
        try {
            int indice = Integer.parseInt(scanner.nextLine().trim());
            if (indice < 0 || indice >= lojas.size()) {
                System.out.println("Índice inválido.");
            } else {
                lojaSelecionada = lojas.get(indice);
                System.out.println("Loja selecionada: " + lojaSelecionada.getNomeLoja());
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Por favor, insira um número.");
        }
        return lojaSelecionada;
    }

    // Método auxiliar que busca a loja pelo CNPJ
    public static Loja buscarLojaPorCNPJ(String cnpjPesquisa) {
        for (Loja loja : lojas) {
            if (loja.getCnpjLoja().equals(cnpjPesquisa)) {
                return loja;
            }
        }
        return null;
    }

    // Método que interage com o usuário para selecionar a loja pelo CNPJ
    public static Loja selecionarLojaPorCNPJ() {
        if (lojas.isEmpty()) {
            System.out.println("Nenhuma loja cadastrada!");
            return null;
        }
        System.out.println("Digite o CNPJ da loja que deseja selecionar:");
        String cnpjPesquisa = scanner.nextLine().trim();
        if (cnpjPesquisa.isEmpty()) {
            System.out.println("Entrada vazia! Por favor, insira um CNPJ válido.");
            return null;
        }
        Loja lojaEncontrada = buscarLojaPorCNPJ(cnpjPesquisa);
        if (lojaEncontrada != null) {
            System.out.println("Bem-vindo à Loja: " + lojaEncontrada.getNomeLoja() + "!");
        } else {
            System.out.println("Nenhuma loja encontrada com o CNPJ informado.");
        }
        return lojaEncontrada;
    }
}