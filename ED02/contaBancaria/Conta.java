package contaBancaria;
/**
 * Classe abstrata que representa uma conta bancária genérica.
 * Contém métodos para depositar, sacar, transferir e aplicar juros.
 */
public abstract class Conta {
    protected String cliente;
    protected double saldo;

    /**
     * Construtor da conta bancária.
     * @param cliente Nome do titular da conta
     * @param saldoInicial Saldo inicial da conta
     */
    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    /**
     * Realiza um depósito na conta.
     * @param valor Valor a ser depositado
     */
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito deve ser positivo.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado para " + cliente + ".");
    }

    /**
     * Realiza um saque na conta.
    * O valor deve ser positivo e não pode exceder o saldo.
     * @param valor Valor a ser sacado
     */
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo.");
            return;
        }
        if (saldo < valor) {
            System.out.println("Saldo insuficiente para saque de R$" + valor + ".");
            return;
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado para " + cliente + ".");
    }

    /**
     * Transfere valor para outra conta.
     * Verifica se o valor é positivo e se há saldo suficiente.
     * @param destino Conta de destino
     * @param valor Valor a ser transferido
     */
    public void transferir(Conta destino, double valor) {
        if (valor <= 0) {
            System.out.println("Valor de transferência deve ser positivo.");
            return;
        }
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente para transferência.");
            return;
        }
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferência de R$" + valor + " de " + this.cliente + " para " + destino.cliente + " realizada.");
    }

    /**
     * Retorna o saldo atual da conta.
     * @return Saldo atual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Aplica juros diários conforme regras de cada conta.
     */
    public abstract void aplicarJurosDiarios();

    /**
     * Imprime o extrato da conta.
     */
    public abstract void imprimirExtrato();
}