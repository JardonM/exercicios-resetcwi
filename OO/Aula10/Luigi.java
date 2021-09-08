package OO.Aula10;

public class Luigi extends Personagem {

    public Luigi() {
        this.setNome("Luigi");
        this.setAltura(1.75);
        this.setIdade(35);
    }

    @Override
    public void comerCogumelo() {
        this.mudaForca();
        this.crescer();
        this.mudaVelocidade();
    }

    @Override
    protected void crescer() {
        this.setAltura(this.getAltura() * 1.75);
    }

    public void voar() {
        System.out.println("Luigi está voando.");
    }

}
