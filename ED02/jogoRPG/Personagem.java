package jogoRPG;
/**
 * Classe base para todos os personagens do RPG
 */
public class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    /**
     * Construtor da classe Personagem
     * @param nome Nome do personagem
     * @param hp Pontos de vida inicial
     * @param ataqueBase Pontos de ataque base
     */
    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    /**
     * Método para atacar outro personagem
     * @param inimigo Personagem que será atacado
     */
    public void atacar(Personagem inimigo) {
        System.out.println("\n" + nome + " atacou " + inimigo.nome + " causando " + ataqueBase + " de dano!");
        inimigo.defender(this.ataqueBase);
    }

    /**
     * Método para defender-se de um ataque
     * @param dano Quantidade de dano a ser recebido
     */
    public void defender(int dano) {
        this.hp -= dano;
        System.out.println("\n" + nome + " recebeu " + dano + " de dano! HP restante: " + hp);
    }

    /**
     * Método para usar habilidade especial (implementado nas subclasses)
     */
    public void usarHabilidadeEspecial() {
        System.out.println("\n" + nome + " usou habilidade especial!");
    }

    /**
     * Mostra o status atual do personagem
     */
    public void status() {
        System.out.println("Status: " + nome + " | HP: " + hp + " | Ataque: " + ataqueBase);
    }
}