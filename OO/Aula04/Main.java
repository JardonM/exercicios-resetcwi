package OO.Aula04;


public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();

        mario.status();
        mario.comerCogumelo();
        mario.status();

        Mario marioVerde = new Mario("Luigi", 35, 100, 1.75 );
        marioVerde.setCor("verde");

        marioVerde.status();

    }
}

