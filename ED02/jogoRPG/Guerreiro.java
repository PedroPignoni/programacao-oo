package jogoRPG;
/**
 * Classe que representa um Guerreiro no RPG
 */
public class Guerreiro extends Personagem {
    /**
     * Construtor do Guerreiro
     * @param nome Nome do guerreiro
     */
    public Guerreiro(String nome) {
        super(nome, 150, 20); 
    }
    /**
     * Método para defender-se de um ataque
     * @param dano Quantidade de dano a ser recebido
     * O dano é reduzido pela metade
     * É exibido uma mensagem informando que o dano foi reduzido
     */
    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2; 
        System.out.println(nome + " reduziu o dano pela metade!");
        super.defender(danoReduzido);
    }

    /**
     * Método para usar habilidade especial
     * Exibe uma mensagem informando que o guerreiro usou um golpe duplo
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou GOLPE DUPLO! Ataque dobrado por um turno!");
        this.ataqueBase *= 2;
    }
}