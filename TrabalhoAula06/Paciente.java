package TrabalhoAula06;

import java.util.Scanner;

public class Paciente {
    private String nome;
    private int idade;
    private String sexo;


    public Paciente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        this.nome = sc.nextLine();
        System.out.println("Digite o idade: ");
        this.idade = sc.nextInt();
        System.out.println("Digite o sexo: ");
        this.sexo = sc.nextLine();
    }
}
