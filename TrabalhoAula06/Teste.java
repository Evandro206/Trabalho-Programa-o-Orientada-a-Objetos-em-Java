package TrabalhoAula06;

import TrabalhoAula06.Funcionarios.Responsaveis.ResposavelTecnico;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Teste {
    private static final ArrayList<ResposavelTecnico> bancoDeDados = new ArrayList<>();
    public static void main(String[] args) {
        // Cria uma janela
        JFrame frame = new JFrame("Sistema Hospital");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define os nomes das colunas
        String[] colunas = {"Nome", "CPF", "Salário"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0); // Modelo da tabela

        // Cria a JTable
        JTable tabela = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabela);
        frame.add(scrollPane);

        // Adiciona alguns pacientes ao banco de dados e à tabela
        adicionarPaciente(new ResposavelTecnico(), modelo);
        adicionarPaciente(new ResposavelTecnico(), modelo);
        adicionarPaciente(new ResposavelTecnico(), modelo);

        // Exibe a janela
        frame.setSize(400, 200);
        frame.setVisible(true);

        // Consulta futura
        System.out.println("Dados armazenados no banco de dados:");
        for (ResposavelTecnico p : bancoDeDados) {
            System.out.println(p);
        }
    }

    private static void adicionarPaciente(ResposavelTecnico paciente, DefaultTableModel modelo) {
        // Adiciona ao "banco de dados" e à tabela
        bancoDeDados.add(paciente);
        modelo.addRow(new Object[]{paciente.getNome(), paciente.getCpf(), paciente.getSalario()});
    }
}