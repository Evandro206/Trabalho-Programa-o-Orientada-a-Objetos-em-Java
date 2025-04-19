package TrabalhoAula06;

import java.util.Scanner;

import static TrabalhoAula06.Autenticacao.autenticar;

public class Medico extends Responsaveis {

    public Procedimento agendarProcedimento() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de procedimento: \n- Cosulta\n- Procedimento Cirúrgico\n- Procedimento Estético");
        String tipoProcedimento = sc.nextLine();
        switch (tipoProcedimento) {
            case "Cosulta":
                if (autenticar(this)) {
                    return new Consulta();
                } else {
                    return null;
                }
            case "Procedimento Cirúrgico":
                if (autenticar(this)) {
                    System.out.println("Digite o nome do responsavel: ");
                    String responsavel = sc.nextLine();
                    if (responsavel.equals(responsavelTecnico)) {
                        if (responsavelTecnico.liberarProcedimento()) {
                            return new ProcedimentoCirugico();
                        } else {
                            return null;
                        }
                    }
                }
        }
        return null;
    }
}