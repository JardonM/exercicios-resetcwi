package OO.Aula09;

public class Yoshi extends Personagem {
    private int frutasComidas;
    private int velocidade;
    private int vezesComeuFruta;

    public Yoshi() {
        this.velocidade = 10;
        this.frutasComidas = 0;
    }


    public void comerFruta() {
        this.frutasComidas++;
        this.vezesComeuFruta++;
        if (this.vezesComeuFruta == 2) {
            this.vezesComeuFruta = 0;
            this.velocidade *= 2;
        }

    }

    public int getVelocidade() {
        return this.velocidade;
    }
}
