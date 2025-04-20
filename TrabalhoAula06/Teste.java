package TrabalhoAula06;

import TrabalhoAula06.Funcionarios.Anestesista;
import TrabalhoAula06.Funcionarios.Enfermeiro;
import TrabalhoAula06.Funcionarios.Funcionario;
import TrabalhoAula06.Funcionarios.Responsaveis.Medico;
import TrabalhoAula06.Funcionarios.Responsaveis.ResponsavelTecnico;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Paciente> pacientes = new ArrayList<>();

        System.out.println("Cadastre o primeiro anestesista");
        funcionarios.add(new Anestesista());
        System.out.println("Cadastre o primeiro Enfermeiro");
        funcionarios.add(new Enfermeiro());
        System.out.println("Cadastre o primeiro Médico");
        funcionarios.add(new Medico());
        System.out.println("Cadastre o primeiro Responsavel Tecnico");
        funcionarios.add(new ResponsavelTecnico());
        System.out.println("Cadastre o primeiro Paciente");
        pacientes.add(new Paciente());
    }
}