package OO.Aula07;


public class Main {
    public static void main(String[] args) {
        Personagem mario = new Personagem("Mario", 40, 1.5);
        Personagem luigi = new Personagem("Luigi", 35, 1.75);

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
        mario.coletarMoedas();
        mario.coletarMoedas();
        mario.coletarMoedas();
        mario.morrer();
        mario.status();
        mario.saltar();


        luigi.perdeEstamina();
        luigi.status();
        luigi.saltar();




    }
}

