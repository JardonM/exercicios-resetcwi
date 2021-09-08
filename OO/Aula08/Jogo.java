package OO.Aula08;

import java.util.Random;

public class Jogo {
    private Personagem jogador1;
    private Personagem jogador2;
    private boolean temJogo;

    public void Jogo (Personagem j1, Personagem j2) {
        this.jogador1 = j1;
        this.jogador2 = j2;
        temJogo = true;
    }

    public void personagensDoJogo() {
        this.jogador1.status();
        this.jogador2.status();
    }

    public void jogar() {
        if(temJogo) {
            Random aleatorio = new Random();
            int vezesJ1 = aleatorio.nextInt(30);
            int vezesJ2 = aleatorio.nextInt(30);

            for (int i = 0; i < vezesJ1; i++) {
                this.jogador1.coletarMoedas();
            }
            for (int i = 0; i < vezesJ2; i++) {
                this.jogador2.coletarMoedas();
            }
            System.out.println("Moedas coletadas pelo jogador 1: " + vezesJ1);
            this.jogador1.status();
            System.out.println("Moedas coletadas pelo jogador 2: " + vezesJ2);
            this.jogador2.status();
        }


    }



}
