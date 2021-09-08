package OO.Aula08;



public class Main {
    public static void main(String[] args) {
        Personagem mario = new Personagem("Mario", 40, 1.5);
        Personagem luigi = new Personagem("Luigi", 35, 1.75);

        Jogo jogo1 = new Jogo();
        jogo1.Jogo(mario, luigi);

        jogo1.personagensDoJogo();

        jogo1.jogar();


    }
}

