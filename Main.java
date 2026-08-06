public class Main {
    public static void main(String[] args) {
        //Instancia dois personagens
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Personagem("Adora", "Mago", 1, 70, 15);
        //Chama o método para exibir as informações do personagem
        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
}
