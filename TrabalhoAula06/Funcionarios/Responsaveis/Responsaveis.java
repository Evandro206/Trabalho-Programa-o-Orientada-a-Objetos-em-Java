package TrabalhoAula06.Funcionarios.Responsaveis;

import TrabalhoAula06.Funcionarios.Funcionario;

import java.util.Scanner;

public class Responsaveis extends Funcionario {
    String senha;

    public Responsaveis() {
        super();
        setSenha();
    }

    public void setSenha() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        this.senha = sc.nextLine();
    }
    public String getSenha() {
        return senha;
    }
}