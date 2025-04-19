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
    public static boolean validarCPF(String cpf) {

        if (cpf.length() != 11) {
            return false;
        }
        int[] pesos1 = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] pesos2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        int primeiroDigito = calcularDigito(cpf.substring(0, 9), pesos1);
        int segundoDigito = calcularDigito(cpf.substring(0, 10), pesos2);

        return cpf.equals(cpf.substring(0, 9) + primeiroDigito + segundoDigito);
    }

    private static int calcularDigito(String str, int[] pesos) {
        int soma = 0;
        for (int i = 0; i < str.length(); i++) {
            soma += (str.charAt(i) - '0') * pesos[i];
        }
        int resto = soma % 11;
        return (resto < 2) ? 0 : 11 - resto;
    }
}
