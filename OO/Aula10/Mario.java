package OO.Aula10;

public class Mario extends Personagem {
    private Yoshi yoshi;

    public Mario() {
        this.setNome("Mario");
        this.setAltura(1.5);
        this.setIdade(40);
    }

    @Override
    public void comerCogumelo() {
        this.mudaForca();
        this.crescer();
        this.mudaVelocidade();
    }

    @Override
    protected void crescer() {
        this.setAltura(this.getAltura() * 1.5);
    }

    public void estaMontado() {
        if (this.yoshi != null) {
            System.out.println("Mario está montado no Yoshi.");
        } else {
            System.out.println("Mario não está montado no Yoshi.");
        }
    }

    public void montarNoYoshi(Yoshi yoshi) {
        this.yoshi = yoshi;
    }





}
