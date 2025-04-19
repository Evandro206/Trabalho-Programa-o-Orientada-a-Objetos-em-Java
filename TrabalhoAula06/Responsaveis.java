package TrabalhoAula06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Responsaveis extends Funcionario {
    String senha;

    public Responsaveis() {
        super();
    }

    public void setSenha() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        this.senha = sc.nextLine();
    }
}