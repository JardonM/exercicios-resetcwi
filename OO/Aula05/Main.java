package OO.Aula05;

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();

        mario.status();
        mario.comerCogumelo();
        mario.recuperaEstamina();
        mario.status();

        Mario marioVerde = new Mario("Luigi", 35, 100, 1.75 );
        marioVerde.setCor("verde");
        marioVerde.perdeEstamina();
        marioVerde.recuperaEstamina();

        marioVerde.status();

    }
}

