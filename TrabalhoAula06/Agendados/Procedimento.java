package TrabalhoAula06.Agendados;

import TrabalhoAula06.Funcionarios.Anestesista;
import TrabalhoAula06.Funcionarios.Responsaveis.Medico;
import TrabalhoAula06.Funcionarios.Responsaveis.Responsaveis;
import TrabalhoAula06.Funcionarios.Responsaveis.ResponsavelTecnico;

public class Procedimento {
    public Medico medico;
    public Anestesista anestesista;
    private boolean liberado;

    public Procedimento(Medico m, Anestesista a) {
        medico = m;
        anestesista = a;
        liberado = false;
    }

    public void liberacao(){
        liberado = true;
    }

    public void exibeprocedimento(){

        System.out.println("O médico que irá realiza o exame é o:" + medico);
        System.out.println("O anestesista que irá fazer a sedação é o" + anestesista);
        if (liberado == true){
            System.out.println("O procedimento se encontra liberado");
        }
        else{
            System.out.println("O procedimento não foi liberado ainda");
        }
    }
}


