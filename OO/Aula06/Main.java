package OO.Aula06;



public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();
        Mario marioVerde = new Mario("Luigi", 35, 1.75);


        mario.status();
        mario.comerCogumelo();
        mario.coletarMoedas();
        mario.coletarMoedas();
        mario.coletarMoedas();
        mario.coletarMoedas();
        mario.coletarMoedas();
        mario.coletarMoedas();
        mario.coletarMoedas();
        mario.coletarMoedas();
        mario.coletarMoedas();
        mario.coletarMoedas();
        mario.status();
        mario.morrer();
        mario.status();


        marioVerde.status();
        marioVerde.morrer();
        marioVerde.morrer();
        marioVerde.morrer();
        marioVerde.status();
        marioVerde.revigorar();
        marioVerde.status();
        marioVerde.perdeEstamina();
        marioVerde.perdeEstamina();
        marioVerde.perdeEstamina();
        marioVerde.status();
        marioVerde.recuperaEstamina();
        marioVerde.status();




    }
}

