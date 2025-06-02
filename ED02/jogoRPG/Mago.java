package jogoRPG;
/**
 * Classe que representa um Mago no RPG
 */
public class Mago extends Personagem {
    /**
     * Construtor do Mago
     * @param nome Nome do mago
     */
    public Mago(String nome) {
        super(nome, 80, 30); 
    }

    /**
     * Método para defender-se de um ataque
     * @param dano Quantidade de dano a ser recebido
     */
    @Override
    public void defender(int dano) {
        System.out.println(nome + " tem defesa fraca!");
        super.defender(dano); 
    }

    /**
     * Método para usar habilidade especial
     * Exibe uma mensagem informando que o mago lançou uma bola de fogo
     * Aumenta o ataque base em 25
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lançou BOLA DE FOGO! Ataque aumentado em 25!");
        this.ataqueBase += 25;
    }
}