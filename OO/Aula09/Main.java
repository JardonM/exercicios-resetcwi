package OO.Aula09;

public class Main {
    public static void main(String[] args) {
        Mario mario = new Mario();
        Yoshi yoshi = new Yoshi();
        Luigi luigi = new Luigi();

        luigi.voar();

        mario.montarNoYoshi(yoshi);

        mario.estaMontado();

        System.out.println(yoshi.getVelocidade());

        yoshi.comerFruta();
        yoshi.comerFruta();
        yoshi.comerFruta();
        yoshi.comerFruta();
        yoshi.comerFruta();

        System.out.println(yoshi.getVelocidade());




    }
}
