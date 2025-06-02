package contaBancaria;

/**
 * Classe que representa uma Conta Poupança bancária.
 * Herda da classe Conta.
 * Aplica juros diários de 0.08%.
 */
public class ContaPoupanca extends Conta {
    private static final double JUROS_DIARIOS = 0.0008; // 0.08%

    /**
     * Construtor da Conta Poupança.
     * @param cliente Nome do titular
     * @param saldoInicial Saldo inicial
     */
    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        double juros = saldo * JUROS_DIARIOS;
        saldo += juros;
        System.out.printf("\nJuros de R$%.2f aplicados na conta de %s.%n", juros, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Poupança ===");
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo: R$%.2f%n", saldo);
        System.out.println("==============================");
    }
}