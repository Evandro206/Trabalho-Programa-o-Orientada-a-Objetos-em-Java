package TrabalhoAula06.Funcionarios.Responsaveis;

import java.util.Scanner;

import static TrabalhoAula06.Verificações.Autenticacao.autenticar;

public class ResponsavelTecnico extends Responsaveis {
    public boolean liberarProcedimento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você deseja liberar o procedimento?\n1 - Sim\n2 - Não");
        int liberar = sc.nextInt();
        if (liberar == 1) {
            if (autenticar(this)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}