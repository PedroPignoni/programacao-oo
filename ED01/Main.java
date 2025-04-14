package ED01; // No pacote ed01

import java.util.Scanner; // Importa Scanner para ler dados do usuário

/**
 * Classe principal do jogo.
 * Aqui o jogador entra com seu nome, começa a jogar e no final o ranking é mostrado.
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Scanner para ler o nome e as tentativas
        Placar placar = new Placar(); // Cria um placar para armazenar o ranking

        // Boas-vindas e coleta do nome do jogador
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.print("Digite o nome do jogador: ");
        String nome = teclado.nextLine(); // Lê o nome do jogador

        Jogador jogador = new Jogador(nome); // Cria um objeto Jogador com o nome dado
        Jogo jogo = new Jogo(jogador); // Cria um objeto Jogo com o jogador

        boolean acertou = false; // Flag para controlar o loop até o jogador acertar

        // Loop do jogo — continua enquanto o jogador não acertar
        while (!acertou) {
            System.out.print("Digite um número entre 1 e 100: ");
            int tentativa = teclado.nextInt(); // Lê a tentativa do jogador

            String resultado = jogo.jogar(tentativa); // Joga e pega o resultado
            System.out.println(resultado); // Exibe o resultado para o jogador

            if (resultado.equals("Acertou!")) {
                acertou = true; // Se acertou, acaba o loop
            }
        }

        // Mostra quantas tentativas o jogador fez e a pontuação final
        System.out.println("Tentativas: " + jogador.getTentativas());
        System.out.println("Pontuação final: " + jogador.getPontuacao());

        // Adiciona o jogador ao placar e mostra o ranking
        placar.adicionarJogador(jogador);
        placar.mostrarRanking(); // Exibe todos os jogadores do ranking

        teclado.close(); // Fecha o scanner
    }
}