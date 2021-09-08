package OO.Aula02;

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.cor = "vermelho";
        mario.tamanho = "pequeno";
        mario.andar = true;
        mario.poderes = "soco, chute, salto";

        mario.status();

    }
}

