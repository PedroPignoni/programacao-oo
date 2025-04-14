package ED01; // Só dizendo que esse arquivo faz parte da pasta/pacote ed01

import java.util.Random; // Importa a classe Random pra gerar número aleatório

/**
 * Classe que cuida da lógica principal do jogo.
 * Aqui rola o sorteio do número secreto e a verificação das tentativas.
 * 
 * @author Pedro
 * @version 1.0
 */
public class Jogo {

    private Jogador jogador;      // Jogador da vez — é private pra proteger, ninguém mexe direto
    private int numeroSecreto;    // Número que o jogador precisa adivinhar

    /**
     * Quando um novo Jogo é criado, já recebe um jogador
     * e sorteia automaticamente um número de 1 a 100.
     * 
     * @param jogador O jogador que vai tentar adivinhar.
     */
    public Jogo(Jogador jogador) {
        this.jogador = jogador; // Armazena o jogador passado
        this.numeroSecreto = new Random().nextInt(100) + 1; // Sorteia número entre 1 e 100
        // Por que +1? Porque nextInt(100) gera de 0 até 99. A gente quer de 1 a 100.
    }

    /**
     * Esse método executa uma rodada do jogo.
     * A cada tentativa, aumenta a contagem e diz se o número é maior, menor ou certo.
     * 
     * @param tentativa Número digitado pelo jogador.
     * @return Mensagem dizendo se errou ou acertou.
     */
    public String jogar(int tentativa) {
        jogador.incrementarTentativas(); // Soma +1 na tentativa, sempre que joga

        if (tentativa > numeroSecreto) {
            return "Menor!"; // Jogou alto demais
        } else if (tentativa < numeroSecreto) {
            return "Maior!"; // Jogou baixo demais
        } else {
            // Acertou! Agora calcula os pontos
            int pontos = 100 - jogador.getTentativas() * 10;
            // Evita pontuação negativa, usa Math.max pra garantir no mínimo 0
            jogador.atualizarPontuacao(Math.max(pontos, 0));
            return "Acertou!"; // Jogador acertou
        }
    }
}