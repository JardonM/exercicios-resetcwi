package OO.Aula10;

public class Yoshi extends Personagem {
    private int frutasComidas;
    private int vezesComeuFruta;

    public Yoshi() {
        this.velocidade = 10;
        this.frutasComidas = 0;
    }

    @Override
    public void comerCogumelo() {
        this.mudaForca();
        this.crescer();
        this.mudaVelocidade();
    }

    @Override
    protected void crescer() {
        this.setAltura(this.getAltura() * 1.1);
    }


    public void comerFruta() {
        this.frutasComidas++;
        this.vezesComeuFruta++;
        if (this.vezesComeuFruta == 2) {
            this.vezesComeuFruta = 0;
            this.velocidade *= 2;
        }

    }



}
