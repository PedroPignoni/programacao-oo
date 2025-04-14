package ED01; // Dizendo que o código está no pacote ed01

/**
 * Classe que representa um jogador no jogo de adivinhação.
 * Armazena o nome do jogador, o número de tentativas e a pontuação.
 */
public class Jogador {

    private String nome;  // Nome do jogador — privado para proteger, ninguém mexe diretamente
    private int tentativas; // Número de tentativas feitas
    private int pontuacao; // Pontuação do jogador

    /**
     * Construtor que define o nome do jogador, e inicializa tentativas e pontuação com 0.
     * 
     * @param nome Nome do jogador.
     */
    public Jogador(String nome) {
        this.nome = nome;          // Guarda o nome do jogador
        this.tentativas = 0;       // Começa com 0 tentativas
        this.pontuacao = 0;        // Começa com 0 pontos
    }

    // Getter para nome — aqui o nome do jogador é acessado fora da classe
    public String getNome() {
        return nome;
    }

    // Setter para nome — permite alterar o nome do jogador, se necessário
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para tentativas — retorna o número de tentativas
    public int getTentativas() {
        return tentativas;
    }

    // Setter para tentativas — permite alterar o número de tentativas (não usado aqui, mas útil)
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    // Getter para pontuação — retorna a pontuação do jogador
    public int getPontuacao() {
        return pontuacao;
    }

    // Setter para pontuação — permite alterar a pontuação do jogador
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * Incrementa o número de tentativas do jogador.
     * Cada vez que o jogador tenta, a contagem de tentativas aumenta.
     */
    public void incrementarTentativas() {
        this.tentativas++; // Adiciona 1 ao número de tentativas
    }

    /**
     * Atualiza a pontuação do jogador.
     * A pontuação é aumentada pelo valor passado como parâmetro.
     * 
     * @param valor Quantidade de pontos a ser somada.
     */
    public void atualizarPontuacao(int valor) {
        this.pontuacao += valor; // Adiciona os pontos ao total
    }
}