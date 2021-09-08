package OO.Aula09;

public class Luigi extends Personagem {

    public Luigi() {
        this.setNome("Luigi");
        this.setAltura(1.75);
        this.setIdade(35);
    }

    public void voar() {
        System.out.println("Luigi está voando.");
    }

    public void saltar() {
        System.out.println("Este personagem pula " + (this.getAltura() * 2) + "m.");
    }
}
