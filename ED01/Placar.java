package ED01; // Está no pacote ed01

import java.util.ArrayList; // Importa ArrayList para armazenar a lista de jogadores

/**
 * Classe responsável por gerenciar o ranking dos jogadores.
 * Armazena a lista de jogadores e exibe a pontuação deles.
 */
public class Placar {

    private ArrayList<Jogador> ranking; // Lista para armazenar jogadores

    /**
     * Construtor que inicializa a lista de ranking (começa vazia).
     */
    public Placar() {
        ranking = new ArrayList<>(); // Cria a lista de ranking vazia
    }

    /**
     * Adiciona um jogador ao ranking.
     * 
     * @param j Jogador a ser adicionado.
     */
    public void adicionarJogador(Jogador j) {
        ranking.add(j); // Adiciona o jogador à lista de ranking
    }

    /**
     * Exibe o ranking com nome e pontuação de todos os jogadores.
     * Mostra na tela a lista de jogadores e suas pontuações.
     */
    public void mostrarRanking() {
        System.out.println("\nRANKING:");
        for (Jogador j : ranking) {
            // Mostra o nome e a pontuação de cada jogador
            System.out.println(j.getNome() + " - Pontuação: " + j.getPontuacao());
        }
    }
}
