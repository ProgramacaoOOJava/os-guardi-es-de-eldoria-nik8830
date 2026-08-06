//cria a classe pública Personagem
public class Personagem {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

//Construtor do Personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

//Método para exibir as informações do personagem
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome:" + nome);
        System.out.println("Classe:" + classe);
        System.out.println("Nivel:" + nivel);
        System.out.println("Vida:" + pontosDeVida);
        System.out.println("Poder:" + poderBase);

    }
}
