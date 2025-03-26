package TrabalhoAula03;

import java.util.Scanner;

public class Transacoes {
    
    // Atributos
    private float valorPago;
    private float troco;
    private float valorTotal;
    private String metodoPagamento;

    private static final Scanner scanner = new Scanner(System.in);

    
    public Transacoes(float valorTotal) {
        this.valorTotal = valorTotal;
 
        System.out.print("Digite o método de pagamento: ");
        this.metodoPagamento = scanner.nextLine();

        System.out.print("Digite o valor pago: ");
        try {
            this.valorPago = Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Valor informado inválido. Configurando valor pago como 0.");
            this.valorPago = 0;
        }

        this.troco = this.valorPago - this.valorTotal;
        

        if (this.troco < 0) {
            System.out.println("Pagamento insuficiente! Falta: " + Math.abs(this.troco));
        } else {
            System.out.println("Pagamento realizado com sucesso.");
            System.out.println("Troco: " + this.troco);
        }
    }

    public float getValorPago() {
        return valorPago;
    }

    public float getTroco() {
        return troco;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }
}
