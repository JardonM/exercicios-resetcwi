package OO.Aula10;

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();
        Yoshi yoshi = new Yoshi();
        Luigi luigi = new Luigi();

        luigi.saltar();
        luigi.saltar(10);
        mario.status();
        mario.comerCogumelo();
        mario.status();


    }
}
