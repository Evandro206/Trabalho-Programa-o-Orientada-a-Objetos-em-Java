package TrabalhoAula06.Funcionarios.Responsaveis;

import TrabalhoAula06.Agendados.ProcedimentoCirurgico;
import TrabalhoAula06.Funcionarios.Funcionario;

import java.util.ArrayList;
import java.util.Optional;
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

    public static ProcedimentoCirurgico BuscaProcedimentoCirurgico(ArrayList<ProcedimentoCirurgico> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do procedimento: ");
        int idprocedimento = sc.nextInt();
        Optional<ProcedimentoCirurgico> proced = arrayList.stream().filter(f -> f.idprocedimento.equals(idprocedimento)).findFirst();
        return proced.isPresent() ? (ProcedimentoCirurgico) proced.get() : null;
    }
}