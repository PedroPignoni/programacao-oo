package contaBancaria;

/**
 * Classe que representa uma Conta Salário bancária.
 * Herda da classe Conta.
 * Não aplica juros.
 */
public class ContaSalario extends Conta {
    /**
     * Construtor da Conta Salário.
     * @param cliente Nome do titular
     * @param saldoInicial Saldo inicial
     */
    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        System.out.println("\nConta Salário não aplica juros para " + cliente + ".");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Salário ===");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo: R$%.2f%n", saldo);
        System.out.println("=============================");
    }
}