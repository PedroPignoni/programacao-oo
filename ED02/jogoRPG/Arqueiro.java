package jogoRPG;
import java.util.Random;

/**
 * Classe que representa um Arqueiro no RPG
 */
public class Arqueiro extends Personagem {
    private Random random = new Random();

    /**
     * Construtor do Arqueiro
     * @param nome Nome do arqueiro
     */
    public Arqueiro(String nome) {
        super(nome, 100, 15);
    }

    /**
     * Método para atacar outro personagem
     * @param inimigo Personagem que será atacado
     * O ataque tem 30% de chance de ser crítico, se for crítico, o dano é dobrado
     * Caso contrário, chama o método atacar
    */
    @Override
    public void atacar(Personagem inimigo) {
        if (random.nextDouble() < 0.3) { // 30% chance de crítico
            int danoCritico = ataqueBase * 2;
            System.out.println(nome + " acertou um ATAQUE CRÍTICO! " + danoCritico + " de dano!");
            inimigo.defender(danoCritico);
        } else {
            super.atacar(inimigo);
        }
    }

    /**
     * Método para usar habilidade especial
     * Exibe uma mensagem informando que o arqueiro usou chuva de flechas
     * O ataque base é triplicado por um turno
     * A habilidade especial pode ser usada apenas uma vez
     * Após o uso, o ataque base volta ao normal
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou CHUVA DE FLECHAS! Ataque triplicado por um turno!\n");
        this.ataqueBase *= 3;
    }
}