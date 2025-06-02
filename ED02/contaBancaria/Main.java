package contaBancaria;
/**
 * Main Class para testar as classes de contas bancárias.
 * Cria instâncias de ContaCorrente, ContaPoupanca e ContaSalario,
 * realiza operações de depósito, saque e transferência,
 * e aplica juros diários.
 * Imprime extratos ao final.
 */
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);

        cc.depositar(200);
        cp.sacar(100);
        cs.transferir(cc, 300);

        cc.aplicarJurosDiarios();
        cp.aplicarJurosDiarios();
        cs.aplicarJurosDiarios();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cs.imprimirExtrato();
    }
}