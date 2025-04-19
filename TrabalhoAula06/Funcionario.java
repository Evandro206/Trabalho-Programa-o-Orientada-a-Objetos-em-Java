package TrabalhoAula06;

import java.util.Scanner;

public class Funcionario {

    // Atributos
    public String nomeFuncionario;
    public String cpf;
    public float salario;

    // ID Funcionário
    public static int idFuncionario = 0;

    // Metodo criador
    public Funcionario() {
        Scanner scanner = new Scanner(System.in);
        idFuncionario++;
        System.out.println("Digite o nome do funcionário");
        this.nomeFuncionario = scanner.nextLine();
        System.out.println("Digite o CPF ou CNPJ do funcionário:");
        this.cpf = scanner.nextLine();
        System.out.println("Difite o salário do funcionário:");
        this.salario = scanner.nextFloat();
    }

    // Metodo para exibir Funcionário
    public void exibirFuncionario() {
        System.out.println("Nome: " + this.nomeFuncionario);
        System.out.println("ID: " + idFuncionario);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: " + this.salario);
    }

    // Metodos getters
    public String getNome(){
        return nomeFuncionario;
    }
    public String getCpf(){
        return cpf;
    }
    public float getSalario(){
        return salario;
    }
}