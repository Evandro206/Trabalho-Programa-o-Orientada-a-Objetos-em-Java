package TrabalhoAula06.Verificações;

import TrabalhoAula06.Funcionarios.Responsaveis.Responsaveis;

import java.util.Scanner;

public class Autenticacao {
    public static boolean autenticar(Responsaveis responsavel) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login: ");
        String login = sc.nextLine();
        if (login.equals(responsavel.nomeFuncionario)) {
            System.out.println("Senha: ");
            String senha = sc.nextLine();
            if (senha.equals(responsavel.senha)) {
                return true;
            } else {
                System.out.println("Login ou senha incorretos!\n Tente novamente!");
                autenticar(responsavel);
            }
        } else {
            System.out.println("Login ou senha incorretos!\n Tente novamente!");
            autenticar(responsavel);
        }
        return false;
    }
}