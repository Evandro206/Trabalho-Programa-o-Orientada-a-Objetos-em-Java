package TrabalhoAula03;

import java.util.ArrayList;

public class Testes {

    public static ArrayList<Loja> main(String[] args) {

        ArrayList<Loja> lojasTeste = new ArrayList<>();

        Loja loja1 = new Loja("Loja Teste 1", "04.252.011/0001-10", "Razão Social 1", "Endereço 1");
        Loja loja2 = new Loja("Loja Teste 2", "12.345.678/0001-95", "Razão Social 2", "Endereço 2");

        lojasTeste.add(loja1);
        lojasTeste.add(loja2);

        return lojasTeste;
    }
}